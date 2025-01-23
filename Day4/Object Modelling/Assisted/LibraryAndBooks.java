import java.util.ArrayList;


class Book {
    private String title;
    private String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Method display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}


class Library {
    private String name;
    // Aggregation
    private ArrayList<Book> books;

    // Constructor
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to display library details and its books
    public void displayLibraryDetails() {
        System.out.println("Library: " + name);
        System.out.println("Books in this library:");
        for (Book book : books) {
            book.displayBookDetails();
        }
    }
}

public class LibraryAndBooks {
    public static void main(String[] args) {
        // Create books
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald");

        // Create libraries
        Library library1 = new Library("City Library");
        Library library2 = new Library("University Library");

        // Add books to libraries
        library1.addBook(book1);
        library1.addBook(book2);

        library2.addBook(book2);
        library2.addBook(book3);
        
        System.out.println("Library 1 Details:-");
        library1.displayLibraryDetails();

        System.out.println("\nLibrary 2 Details:-");
        library2.displayLibraryDetails();
    }
}
