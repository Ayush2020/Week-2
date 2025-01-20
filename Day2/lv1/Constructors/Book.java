public class Book{
    private String title;
    private String author;
    private double price;

    //Default Constructor
   public Book(){
       System.out.println("This is default Constructor ");
   }

   //PArameterized Constructor
   public Book(String title, String author, double price){
       this.title = title;
       this.author = author;
       this.price = price;

   }

   //Getter method
   public  String getTitle(){
       return title;
   }
   public String  getAuthor(){
       return author;
   }

    public double getPrice() {
        return price;
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

    @Override
    public String toString(){
       return "Title is : " + title + " author: " + author + " price is " + price;
    }

    public static void main(String[] args) {
        //Create a Book object for default Constructor
        Book defaultBook = new Book();

        //Create a Book obj for Parameterized Constructor
        Book book1 = new Book("The Wings of power", "Mc Gareld ", 1250);

        System.out.println(defaultBook);
        System.out.println(book1.toString());
    }

}