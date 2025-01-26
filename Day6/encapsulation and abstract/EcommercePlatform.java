abstract class Product{
    private int productId;
    private String name;
    private double price;
    public abstract double calculateDiscount();

    //Constructor
    public Product(int productId, String name, double price){
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Getters and setters for encapsulation
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}


interface Taxable{
    double calculateTax();
    String getTaxDetails();
}
// Electronics class

class Electronics extends Product implements Taxable{
    private static final double DISCOUNT_RATE = 0.10;
    private static final double TAX_RATE = 0.15;

    public Electronics(int productId, String name, double price){
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * DISCOUNT_RATE;
    }

    @Override
    public double calculateTax() {
        return getPrice() * TAX_RATE;
    }

    @Override
    public String getTaxDetails() {
        return "Electronics tax : " + calculateTax();
    }
}

//Clothing class
class Clothing  extends Product implements Taxable{
    private static final double DISOUNT_RATE = 0.20;
    private static final double TAX_RATE = 0.10;

    @Override
    public double calculateDiscount() {
        return getPrice() * DISOUNT_RATE;
    }

    public Clothing(int productId, String name, double price){
        super(productId, name, price);
    }


    @Override
    public double calculateTax() {
        return getPrice() * TAX_RATE;
    }

    @Override
    public String getTaxDetails() {
        return "CLothing Tax : " + calculateTax();
    }
}

class Groceries extends Product {
    private static final  double DISCOUNT_RATE = 0.05;
    public Groceries(int productId, String name, double price){
        super(productId, name, price);

    }
    @Override
    public double calculateDiscount() {
        return getPrice() * DISCOUNT_RATE;
    }
}

public class  EcommercePlatform{
    public static void printFinalPrice(Product product){
        double discount = product.calculateDiscount();
        double finalPrice = product.getPrice() - discount;

        double tax = 0;
        if (product instanceof Taxable){
            Taxable taxableProduct = (Taxable) product;
            tax = taxableProduct.calculateTax();
            System.out.println(taxableProduct.getTaxDetails());
        }

        finalPrice += tax;
        System.out.println("Product :" + product.getName());
        System.out.println("Riginal Price :" + product.getPrice());
        System.out.println("Discount :" + discount);
        System.out.println("Tax:" + tax);
        System.out.println("Final Price:" + finalPrice);
        System.out.println();

    }

    public static void main(String[] args) {
        Product laptop = new Electronics(124, "MAC", 100500);
        Product tshirt = new Clothing(231, "Armani Exchange", 23000);
        Product apple = new Groceries(324, "Apple", 200);

        printFinalPrice(laptop);
        printFinalPrice(tshirt);
        printFinalPrice(apple);
    }
}
