package serializaVSDeserial;

import java.io.Serializable;

public class Employee implements Serializable {
        String name;
        int age;

        public Employee(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
