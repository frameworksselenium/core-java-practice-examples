package oops.inheritence.hasARelation.composition;

public class Engine {
    private int cylinders;
    private boolean isRunning;

    public Engine(int cylinders) {
        this.cylinders = cylinders;
        this.isRunning = false;
    }

    public void start() {
        this.isRunning = true;
        // Code to start the engine
    }

    public void stop() {
        this.isRunning = false;
        // Code to stop the engine
    }

    public int getEngineCylinders(){
        return cylinders;
    }


}