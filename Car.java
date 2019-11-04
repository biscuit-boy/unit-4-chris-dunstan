
public class Car{
    public String make;
    public String model;

    public double fuelEfficiency;
    public double fuelInTank;

    public Car(String Make, String Model){
        make = Make;
        model = Model;
    }

    public void info(){
        System.out.println(make);
        System.out.println(model);
    }
}