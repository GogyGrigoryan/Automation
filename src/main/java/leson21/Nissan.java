package leson21;

public class Nissan extends Car{
    public Nissan(String model, Cartype type){
        setModel(model);
        setType(type);
    }

    void startEngine() {
        if (isEngineState()){
            System.out.println("The engine of Nissan is already turned on");
        }else {
            setEngineState(true);
            System.out.println("Now the engine of Nissan is turned on");
        }

    }

    void stopENgine() {
        if(isEngineState()){
            setEngineState(false);
            System.out.println("the engine of Nissan is turned off");
        }
        else {
            System.out.println("Ooops!!!! the engine of Nisan is already turned off");
        }

    }
}
