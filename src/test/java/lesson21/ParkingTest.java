package lesson21;

import leson21.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParkingTest {
    Parking parking;
    Kia kia1=new Kia("Forte", Car.Cartype.Coupe);
    Kia kia2=new Kia("Spotage", Car.Cartype.Jeep);
    Kia kia3=new Kia("Forte", Car.Cartype.Sedan);
    Kia kia4=new Kia("Sorrento", Car.Cartype.Jeep);
    Kia kia5=new Kia("Rio", Car.Cartype.Sedan);
    Nissan nissan1=new Nissan("Juke",Car.Cartype.Jeep);
    Nissan nissan2=new Nissan("Teana",Car.Cartype.Sedan);
    Nissan nissan3 =new Nissan("Altima",Car.Cartype.Coupe);
    Nissan nissan4 =new Nissan("Rouge",Car.Cartype.Jeep);
    Nissan nissan5 =new Nissan("Xterria",Car.Cartype.Jeep);
    Nissan nissan6 =new Nissan("Nismo",Car.Cartype.Coupe);
    Subaru subaru1=new Subaru("Forester",Car.Cartype.Jeep);
    Subaru subaru2=new Subaru("Impreza",Car.Cartype.Sedan);
    Subaru subaru3=new Subaru("Malaysia",Car.Cartype.Jeep);
    Subaru subaru4=new Subaru("BRZ",Car.Cartype.Coupe);
    Subaru subaru5=new Subaru("Aberdeen",Car.Cartype.Coupe);

    @BeforeMethod
    public void setUp(){
        parking=new Parking(3);
    }
    @Test
    public void add1Car(){
        parking.addCarInParking(kia1);
        Assert.assertTrue(parking.getCount()==1);
    }
    @Test
    public void addTheSameCar(){
        parking.addCarInParking(kia1);
        parking.addCarInParking(kia1);
        Assert.assertTrue(parking.getCount()==1);

    }
    @Test
    public void full(){
        parking.addCarInParking(kia2);
        parking.addCarInParking(kia4);
        parking.addCarInParking(nissan4);
        parking.addCarInParking(subaru3);
        Assert.assertTrue(parking.getCount()==1);
    }
}
