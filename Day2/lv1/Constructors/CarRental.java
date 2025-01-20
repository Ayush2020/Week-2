public class CarRental{
    private String customerName;
    private String carModel;
    private int rentalDays;

    //Default Constructors
    public CarRental(){
        System.out.println("Default Constructor");
    }
    //Parameterixed Constructor
    public CarRental(String customerName, String carModel, int rentalDays){
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    //getter method
    public String getCustomerName(){
        return customerName;
    }

    public String getCarModel(){
        return carModel;
    }
    public int getRentalDays(){
        return rentalDays;
    }

    //setter method
    public void setCustomerName(){
        this.customerName = customerName;
    }
    public void setCarModel(){
        this.carModel = carModel;
    }
    public void setRentalDays(){
        this.rentalDays = rentalDays;
    }

   @Override
    public String toString(){
        return "Customer Name : " + customerName + "\nCar Model : " + carModel + "\nRental Days : " + rentalDays;
   }

    public static void main(String[] args) {
        CarRental car = new CarRental();
        CarRental car1 = new CarRental("Tony", "Audi R8", 12);

        int totalCost = 50 * car1.rentalDays;
        System.out.println(car1);
        System.out.println("Total Cost " + totalCost + " for 12 days. ");
    }
}