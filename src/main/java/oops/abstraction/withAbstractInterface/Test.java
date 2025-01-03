package oops.abstraction.withAbstractInterface;

public class Test {

    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.eat();
        dog.sleep();

        Animal cat = new Cat();
        cat.eat();
        cat.sleep();


    }


}
