
class Book{
    public int ISBN;
    protected String title;
    private String author;

    //COnstructor

    public Book(int ISBN, String title, String author){
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }
    //getter setter
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
}
class Ebook extends Book{

    public Ebook(int ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    public void displayDetails(){
        System.out.println("ISBN NUmber : " + ISBN);
        System.out.println("Title : " + title);
        System.out.println("Author: " + getAuthor());
    }
}

public class BookLibrarySystem{
    public static void main(String[] args) {
        Ebook ebook = new Ebook(999777232, "NanoParticles", "Tony Stark");
        ebook.displayDetails();
        System.out.println();

        //Upadete the author name
        ebook.setAuthor("Steve Cruze");
        ebook.displayDetails();

    }
}