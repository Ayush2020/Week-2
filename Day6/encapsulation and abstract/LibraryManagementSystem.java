interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}


abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    // Constructor
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Concrete method to get common item details
    public String getItemDetails() {
        return "Item ID: " + itemId + ", Title: " + title + ", Author: " + author;
    }

    // Abstract method to get loan duration (days)
    public abstract int getLoanDuration();

    // Getters and Setters for encapsulation
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}


// Book class implements Reservable
class Book extends LibraryItem implements Reservable {
    private boolean isReserved;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;  // Initially, the book is not reserved
    }

    @Override
    public int getLoanDuration() {
        return 14;  // Books can be borrowed for 14 days
    }

    @Override
    public void reserveItem() {
        if (!isReserved) {
            isReserved = true;
            System.out.println("The book \"" + getTitle() + "\" has been reserved.");
        } else {
            System.out.println("The book \"" + getTitle() + "\" is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}

// Magazine class implements Reservable
class Magazine extends LibraryItem implements Reservable {
    private boolean isReserved;

    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    @Override
    public int getLoanDuration() {
        return 7;  // Magazines can be borrowed for 7 days
    }

    @Override
    public void reserveItem() {
        if (!isReserved) {
            isReserved = true;
            System.out.println("The magazine \"" + getTitle() + "\" has been reserved.");
        } else {
            System.out.println("The magazine \"" + getTitle() + "\" is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}

// DVD class implements Reservable
class DVD extends LibraryItem implements Reservable {
    private boolean isReserved;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    @Override
    public int getLoanDuration() {
        return 3;  // DVDs can be borrowed for 3 days
    }

    @Override
    public void reserveItem() {
        if (!isReserved) {
            isReserved = true;
            System.out.println("The DVD \"" + getTitle() + "\" has been reserved.");
        } else {
            System.out.println("The DVD \"" + getTitle() + "\" is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}
public class LibraryManagementSystem {

    // Method to display item details, loan duration, and check availability
    public static void processLibraryItem(LibraryItem item) {
        System.out.println(item.getItemDetails());
        System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

        // If the item is reservable, reserve it and check availability
        if (item instanceof Reservable) {
            Reservable reservableItem = (Reservable) item;
            System.out.println("Availability: " + (reservableItem.checkAvailability() ? "Available" : "Not Available"));
            reservableItem.reserveItem();  // Reserve the item
        }

        System.out.println();
    }

    public static void main(String[] args) {
        // Create instances of different LibraryItems
        LibraryItem book = new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald");
        LibraryItem magazine = new Magazine("M001", "National Geographic", "Various Authors");
        LibraryItem dvd = new DVD("D001", "Inception", "Christopher Nolan");

        // Process each item
        processLibraryItem(book);
        processLibraryItem(magazine);
        processLibraryItem(dvd);

        // Try to reserve the book again
        processLibraryItem(book);
    }
}
