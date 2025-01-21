
class Book {
    // Static variable
    static String libraryName = "City Library";


    final String isbn;

    // Instance variables
    String title;
    String author;

    // Constructor to initialize book details
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Method to display book details
    public void displayBookDetails() {
        if (this instanceof Book) {  // Verifying if the object is an instance of Book
            System.out.println("Book Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        // Creating Book objects
        Book book1 = new Book("Lord of the rings", "George Orwell", "978-0451524935");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "978-0061120084");

        // Displaying the library name
        Book.displayLibraryName();  // Calling static method using class name

        // Displaying details of the books
        book1.displayBookDetails();
        System.out.println();
        book2.displayBookDetails();
    }
}
