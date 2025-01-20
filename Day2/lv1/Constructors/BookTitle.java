public class BookTitle{
    private String title;
    private String author;
    private  double price;
    private String availability;


    //PArameterized Constructor
    public BookTitle(String title, String author, double price, String availability){
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }
    //getter method
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public String getAvailability(){
        return availability;
    }

    //Setter method
    public void setTitle(){
        this.title = title;
    }
    public void setAuthor(){
        this.author = author;
    }
    public void setPrice(){
        this.price = price;
    }
    public void setAvailability(){
        this.availability = availability;
    }

    public String toString(){
        return "Book Title : " + title + "\nAuthor : " + author + "\nPrice : " + price + "\nAvailable : " + availability;
    }

    public static void main(String[] args) {
        BookTitle book = new BookTitle("The Rings Of Power ", "Numen gray ", 1800.00, "Yes");
        System.out.println(book);
    }


}