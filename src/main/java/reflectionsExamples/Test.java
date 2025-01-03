package reflectionsExamples;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws Exception {
        // Get the Class object
        Class<?> classObj = Class.forName("reflectionsExamples.Student");

        // Create an instance of the class
        Constructor<?> constructor = classObj.getConstructor(String.class, int.class, String.class);
        Object student = constructor.newInstance("John", 1, "123 Street");

        // Get the Method object for the setName method
        Method setNameMethod = classObj.getMethod("setName", String.class);

        // Invoke the setName method on the student instance
        setNameMethod.invoke(student, "Jane");

        // Get the Method object for the getName method
        Method getNameMethod = classObj.getMethod("getName");

        // Invoke the getName method on the student instance
        String name = (String) getNameMethod.invoke(student);

        System.out.println("The name of the student is: " + name);
    }
}