class Vehicle{
    int maxSpeed;
    String fuelType;

    //Constructor
    public Vehicle(int maxSpeed, String fuelType){
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }
    public void displayInfo(){
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("FuelType : " + fuelType);
    }
}

class Car extends Vehicle{
    int seatCapacity;
    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Seat Capacity: "  + seatCapacity);
    }
}

class Truck extends Vehicle{
    String loadingCapacity;
    public Truck(int maxSpeed, String fuelType, String loadingCapacity) {
        super(maxSpeed, fuelType);
        this.loadingCapacity = loadingCapacity;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Loading Capacity : " + loadingCapacity);
    }
}

class Motorcycle extends Vehicle{
    String bikeType;
    public Motorcycle(int maxSpeed, String fuelType, String bikeType) {
        super(maxSpeed, fuelType);
        this.bikeType = bikeType;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Bike Type : " + bikeType);
    }
}

public class VehicleAndTransportSystem{
    public static void main(String[] args) {
        Vehicle car = new Car(300, "Petrol", 4);
        Vehicle truck = new Truck(100, "Diesel", "1000kg");
        Vehicle motorcycle = new Motorcycle(250,"Petrol", "Sports Bike");

        //Vehicle array object
        Vehicle[] vehicles = {car , truck, motorcycle};

        for (Vehicle vehicle: vehicles){
            System.out.println("vehicle Info");
            vehicle.displayInfo();
            System.out.println();
        }
    }
}