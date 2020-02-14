package leson21;

public class Parking {
    private int count=0;
    private int parkingLength;
    private Car[][] parkinglist;

    public Parking(int parkingLength) {
        this.parkingLength = parkingLength;
        this.parkinglist = new Car[parkingLength][parkingLength];
    }

    private void addCarlogic(int floor, Car car) {
        for (int i = 0; i < parkinglist[floor].length ; i++) {
            if (parkinglist[floor][i] != null && car.getModel() == parkinglist[floor][i].getModel()) {
                System.out.println("Ooops!!! The car is already in the parking");
                break;
            } else if (parkinglist[floor][i] == null) {
                parkinglist[floor][i] = car;
                count += 1;
                System.out.println("The car is added");
                System.out.println("THe floor is " + floor + "    The model is  " + car.getModel());
                break;
            } else if (i == parkinglist[floor].length - 1) {
                System.out.println("The floor is full, bro");
            }
        }
    }

   public void addCarInParking(Car car) {
        if (count == parkingLength * parkingLength) {
            System.out.println("Parking is full, please remove a car");
        } else {
            switch (car.getType()) {
                case Jeep:
                    addCarlogic(0, car);
                    break;
                case Sedan:
                    addCarlogic(1, car);
                    break;
                case Coupe:
                    addCarlogic(2, car);
                    break;
                default:
                    System.out.println("This type of car cannot parked here");
            }
        }
    }

    void removeCar(int floor, int index) {
        if (index >= 0 && floor >= 0 && index < parkinglist.length && floor < parkingLength && parkinglist[floor][index] != null) {
            System.out.println(parkinglist[floor][index].getModel() + " is being removed from the parking.");
            parkinglist[floor][index] = null;
        } else {
            System.out.println("Error. Please try again. There is no such place or the palce is empty");
        }
    }

    public void getAllInfo() {
        for (int i = 0; i < parkinglist.length; i++) {
            for (int j = 0; j < parkinglist[i].length; j++) {
                {
                    if (parkinglist[i][j] != null) {
                        System.out.println("Model: " + parkinglist[i][j].getModel());
                    }
                }
            }
        }
    }

    public int getCount() {
        return count;
    }
}
