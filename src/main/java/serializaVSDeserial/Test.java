package serializaVSDeserial;

import java.io.*;


public class Test {
    public static void main(String[] args) {
        Employee emp = new Employee("John", 30);

        // Serialization
        try {
            FileOutputStream fileOut = new FileOutputStream("./employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(emp);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in ./employee.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }

        // Deserialization
        Employee deserializedEmp = null;
        try {
            FileInputStream fileIn = new FileInputStream("./employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            deserializedEmp = (Employee) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }

        System.out.println("Deserialized Employee...");
        System.out.println("Name: " + deserializedEmp.name);
        System.out.println("Age: " + deserializedEmp.age);
    }
}