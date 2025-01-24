interface Refuelable{
    void refuel();
}

class Vehicle{
    String maxSpeed;
    String model;
    //Constructor
    public Vehicle(String maxSpeed, String model){
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public void displayDetails(){
        System.out.println("Vehicle Model-" + model);
        System.out.println("MAX Speed - " + maxSpeed);
    }
}

class ElectricVehicle extends Vehicle{

    public ElectricVehicle(String maxSpeed, String model) {
        super(maxSpeed, model);
    }
    //Electric vehicle specified method
    public void charge(){
        System.out.println("Charging...");
    }
}


class PetrolVehicle extends Vehicle implements Refuelable{

    public PetrolVehicle(String maxSpeed, String model) {
        super(maxSpeed, model);
    }

    @Override
    public void refuel() {
        System.out.println("Refueling PEtrol Vehicle...");
    }
}

public class VehicleManagementSystem{
    public static void main(String[] args) {
        //Create Instance of Electric vehicle and PetrolVehicle
        ElectricVehicle electricCar = new ElectricVehicle("190 km/h", "Mahindra BE6");
        PetrolVehicle petrolCar = new PetrolVehicle("400 km/h","Bugatti Veyron");

        electricCar.displayDetails();
        electricCar.charge();
        System.out.println();

        petrolCar.displayDetails();
        petrolCar.refuel();
    }
}