public class Vehicle{
    private String ownerName;
    private String vehicleType;
    public static int registrationFee = 2000;



    //Constructor
    public Vehicle(String ownerName, String vehicleType){
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
    //Instance Method to display owner details
    void displayVehicleDetails(){
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle type : " + vehicleType);
        System.out.println("Registration Fees: " + registrationFee);
    }
    //updateRegistrationFee() method to change registration fees
    public static void updateRegistrationFee(int newregistrationFees){
        registrationFee = newregistrationFees;
        System.out.println("New registration fees : " + newregistrationFees);
    }

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Tony", "Sports");
        vehicle1.displayVehicleDetails();
        System.out.println();

        Vehicle vehicle2 = new Vehicle("Steve","Sedan");
        vehicle2.displayVehicleDetails();
        System.out.println();

        Vehicle vehicle3 = new Vehicle("Clint", "SUV");
        vehicle3.displayVehicleDetails();
        System.out.println();

        //Updating fees
        Vehicle.updateRegistrationFee(4000);

        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
        vehicle3.displayVehicleDetails();
    }

}