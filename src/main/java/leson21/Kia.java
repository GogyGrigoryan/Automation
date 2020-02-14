package leson21;

public class Kia extends Car {

    public Kia(String model, Cartype type){
        setModel(model);
        setType(type);
    }

    void startEngine() {
        if(isEngineState()){
            System.out.println("Engine is already started. ");
        }else{
            setEngineState(true);
            System.out.println("pleaseeeee, turned on the Engine");
        }

    }

    void stopENgine() {
        if(isEngineState()){
            setEngineState(false);
            System.out.println("Engine is turned off");

        } else {
            System.out.println("The Engine is already turned off");
        }

    }

}
