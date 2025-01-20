public class Product{
    private String productName;
    private double price;

    private static int totalProducts = 0 ;

    public Product(String productName, double price){
        this.productName =  productName;
        this.price = price;
        totalProducts++; //Increment the toral number of Products
    }
    //Instance method to display details of Product
    public void displayProductDetails(){
        System.out.println("Product Name : " + productName);
        System.out.println("Price : $" + price);
    }
    //Class Method to display total Products
    public static  void displayTotalProducts(){
        System.out.println("Total Products : " + totalProducts);
    }

    public static void main(String[] args) {
        Product product1 = new Product("Iphone 16", 88.00);
        Product product2 = new Product("Dell Laptop", 100.00);
        Product product3 = new Product("Bag", 10.00);

        System.out.println("Product 1 Details: ");
        product1.displayProductDetails();
        System.out.println();

        System.out.println("Product 2 Details: ");
        product2.displayProductDetails();
        System.out.println();

        System.out.println("Product 3 Details: ");
        product3.displayProductDetails();
        System.out.println();

        displayTotalProducts();
    }
}