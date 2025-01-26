interface Discountable {
    void applyDiscount();
    String getDiscountDetails();
}

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Concrete method to get item details
    public String getItemDetails() {
        return "Item Name: " + itemName + ", Price: " + price + ", Quantity: " + quantity;
    }

    // Abstract method to calculate the total price
    public abstract double calculateTotalPrice();

    // Getters and Setters for encapsulation
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

// VegItem implements Discountable
class VegItem extends FoodItem implements Discountable {
    private static final double VEG_DISCOUNT_RATE = 0.05;  // 5% discount for veg items

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        // Veg items might have a discount (e.g., 5% off)
        double total = getPrice() * getQuantity();
        return total - (total * VEG_DISCOUNT_RATE);
    }

    @Override
    public void applyDiscount() {
        System.out.println("Applying " + (VEG_DISCOUNT_RATE * 100) + "% discount for Veg Item.");
    }

    @Override
    public String getDiscountDetails() {
        return "Discount: " + (VEG_DISCOUNT_RATE * 100) + "% off for Veg Item.";
    }
}

// NonVegItem implements Discountable
class NonVegItem extends FoodItem implements Discountable {
    private static final double NON_VEG_CHARGE = 1.5;  // Additional charge for non-veg items
    private static final double NON_VEG_DISCOUNT_RATE = 0.10;  // 10% discount for non-veg items

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        // Non-veg items may have an additional charge
        double total = (getPrice() + NON_VEG_CHARGE) * getQuantity();
        return total - (total * NON_VEG_DISCOUNT_RATE);
    }

    @Override
    public void applyDiscount() {
        System.out.println("Applying " + (NON_VEG_DISCOUNT_RATE * 100) + "% discount for Non-Veg Item.");
    }

    @Override
    public String getDiscountDetails() {
        return "Discount: " + (NON_VEG_DISCOUNT_RATE * 100) + "% off for Non-Veg Item.";
    }
}

public class OnlineFoodDeliverySystem {

    // Method to process food items and calculate total price
    public static void processFoodItem(FoodItem item) {
        System.out.println(item.getItemDetails());
        System.out.println("Total Price: " + item.calculateTotalPrice());

        // If the item is discountable, apply the discount and show discount details
        if (item instanceof Discountable) {
            Discountable discountableItem = (Discountable) item;
            discountableItem.applyDiscount();
            System.out.println(discountableItem.getDiscountDetails());
        }

        System.out.println();
    }

    public static void main(String[] args) {
        // Create food item objects
        FoodItem vegItem = new VegItem("Vegetable Pizza", 200.00, 2);
        FoodItem nonVegItem = new NonVegItem("Chicken Burger", 150.00, 3);

        // Process the items
        processFoodItem(vegItem);
        processFoodItem(nonVegItem);
    }
}


