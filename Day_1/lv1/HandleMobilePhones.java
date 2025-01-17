public class HandleMobilePhones {
    public static void main(String[] args) {
//        create objects
        MobilePhones m1 = new MobilePhones("VIVO", "VIVO T1 5G ", 17500.00);
        m1.DisplayDetails();

    }
}

class MobilePhones {
//    attribute
    private String brand;
    private  String model;
    private double price;

    public MobilePhones(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
	//displaying result calling method DisplayingDetails
    public void DisplayDetails() {
        System.out.println("brand is "+ brand + "\nmodel is " + model + "\nprice "+ price);

    }

}