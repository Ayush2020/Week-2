

interface Insurable {
    double calculateInsurance(); // Method to calculate insurance
    String getInsuranceDetails(); // Method to get insurance details
}


abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    // Constructor
    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Abstract method to calculate rental cost
    public abstract double calculateRentalCost(int days);

    // Getters and setters for encapsulation
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }
}

// Car class
class Car extends Vehicle implements Insurable {
    private static final double INSURANCE_RATE = 0.05; // 5% of rental cost for insurance

    public Car(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Car", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return calculateRentalCost(1) * INSURANCE_RATE;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance: " + calculateInsurance();
    }
}

// Bike class
class Bike extends Vehicle implements Insurable {
    private static final double INSURANCE_RATE = 0.03; // 3% of rental cost for insurance

    public Bike(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Bike", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return calculateRentalCost(1) * INSURANCE_RATE;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance: " + calculateInsurance();
    }
}

// Truck class
class Truck extends Vehicle implements Insurable {
    private static final double INSURANCE_RATE = 0.07; // 7% of rental cost for insurance

    public Truck(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Truck", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return calculateRentalCost(1) * INSURANCE_RATE;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance: " + calculateInsurance();
    }
}

public class VehicleRentalSystem {

    public static void calculateAndPrintCosts(Vehicle vehicle, int rentalDays) {
        double rentalCost = vehicle.calculateRentalCost(rentalDays);
        System.out.println("Vehicle Type: " + vehicle.getType());
        System.out.println("Vehicle Number: " + vehicle.getVehicleNumber());
        System.out.println("Rental Cost for " + rentalDays + " days: " + rentalCost);

        // If the vehicle is insurable, calculate and print insurance details
        if (vehicle instanceof Insurable) {
            Insurable insurableVehicle = (Insurable) vehicle;
            System.out.println(insurableVehicle.getInsuranceDetails());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create individual vehicles
        Vehicle car = new Car("C123", 50);
        Vehicle bike = new Bike("B456", 20);
        Vehicle truck = new Truck("T789", 100);

        // Calculate and print rental and insurance costs for each vehicle (for 5 days)
        calculateAndPrintCosts(car, 5);
        calculateAndPrintCosts(bike, 5);
        calculateAndPrintCosts(truck, 5);
    }
}
