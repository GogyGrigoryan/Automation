package leson21;

public abstract class Car {
    private boolean engineState;
    private String model;
    private Cartype type;
    private int currentSpeed;
    public enum Cartype{
        Sedan,Jeep,Coupe
    }

    public Cartype getType() {
        return type;
    }

    public void setType(Cartype type) {
        this.type = type;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isEngineState() {
        return engineState;
    }

    public void setEngineState(boolean engineState) {
        this.engineState = engineState;
    }
    void changeSpeed(int speed) {
        if (speed>0){
            System.out.println("Your speed is decressed by "+ speed+ "km/h");
        }else {
            System.out.println("Your speed is incresed by "+ speed+ "km/h");
        }
        currentSpeed+=speed;
        System.out.println("Your currentSpeed is "+currentSpeed);
    }
    abstract void startEngine();
    abstract void stopENgine();

}
