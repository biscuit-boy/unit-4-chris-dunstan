
public class Car{
    public String make;
    public String model;

    public double fuelEfficiency;
    public double fuelInTank;

    public Car(String Make, String Model){
        make = Make;
        model = Model;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public double getFuelInTank(){
        return fuelInTank;
    }

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public void setFuelEfficiency(double x){
        fuelEfficiency = x;
        return;
    }

    public void setFuelInTank(double x){
        fuelInTank = x;
        return;
    }

    public void setMake(String x){
        make = x;
        return;
    }

    public void setModel(String x){
        model = x;
        return;
    }
}