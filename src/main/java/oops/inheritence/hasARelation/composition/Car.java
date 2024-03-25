package oops.inheritence.hasARelation.composition;
public class Car {
    private Engine engine;

    public Car() {
        this.engine = new Engine(6);
    }

    public int getEngineCylinders(){
        return engine.getEngineCylinders();
    }

}