package objectArrays;

public class Main {
    public static void main(String[] args) {
        // Create an array of Student objects
        Student[] students = new Student[3];

        // Create Student objects and assign them to the array
        students[0] = new Student("John", 20);
        students[1] = new Student("Jane", 22);
        students[2] = new Student("Doe", 21);

        // Print student names and ages
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", Age: " + student.getAge());
        }
    }
}
