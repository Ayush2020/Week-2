class Book{
    String title;
    int publicationYear;
    
    //Constructor
    public Book(String title, int publicationYear){
        this.title = title;
        this.publicationYear = publicationYear;
    }
    public void displayInfo(){
        System.out.println("Title : " + title);
        System.out.println("Publication Year : " + publicationYear);
    }
}

class Author extends Book {
    String name;
    String bio;
    //Constructor

    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }
//    Method Overriding

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author name: " + name);
        System.out.println("Bio : " + bio);
    }
}

public class LibraryManagement{
    public static void main(String[] args) {
        Author author = new Author("Love is Gone ", 2020,"Mr Nobody ","Die with a Smile ");
        author.displayInfo();
    }
}
