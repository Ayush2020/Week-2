interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}


abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    // Constructor
    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Concrete method to get vehicle details
    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate per Km: " + ratePerKm;
    }

    // Abstract method to calculate fare
    public abstract double calculateFare(double distance);

    // Getters and Setters for encapsulation
    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public void setRatePerKm(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }
}

// Car class implements GPS
class Car extends Vehicle implements GPS {
    private static final double TAX_RATE = 0.15;
    private String location;

    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.location = "Unknown"; // Default location
    }

    @Override
    public double calculateFare(double distance) {
        double fare = getRatePerKm() * distance;
        fare += fare * TAX_RATE;
        return fare;
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.location = newLocation;
    }
}

// Bike class implements GPS
class Bike extends Vehicle implements GPS {
    private String location;

    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.location = "Unknown"; // Default location
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.location = newLocation;
    }
}

// Auto class implements GPS
class Auto extends Vehicle implements GPS {
    private static final double SURCHARGE = 5.0;
    private String location;

    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.location = "Unknown"; // Default location
    }

    @Override
    public double calculateFare(double distance) {
        double fare = getRatePerKm() * distance;
        fare += SURCHARGE;
        return fare;
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.location = newLocation;
    }
}

public class RideHailingApplication {

    // Method to calculate fare for any vehicle type dynamically
    public static void calculateFare(Vehicle vehicle, double distance) {
        System.out.println(vehicle.getVehicleDetails());
        System.out.println("Fare for " + distance + " km: " + vehicle.calculateFare(distance));

        // If the vehicle implements GPS, display and update the location
        if (vehicle instanceof GPS) {
            GPS gpsVehicle = (GPS) vehicle;
            System.out.println("Current Location: " + gpsVehicle.getCurrentLocation());
            gpsVehicle.updateLocation("New Location");
            System.out.println("Updated Location: " + gpsVehicle.getCurrentLocation());
        }

        System.out.println();
    }

    public static void main(String[] args) {
        // Create vehicle objects
        Vehicle car = new Car("V123", "Ninja  Op", 10.0);
        Vehicle bike = new Bike("V456", "Tyson", 5.0);
        Vehicle auto = new Auto("V789", "Ducattii", 7.0);

        // Calculate fare for each vehicle
        calculateFare(car, 15); // 15 km
        calculateFare(bike, 10); // 10 km
        calculateFare(auto, 20); // 20 km
    }
}

