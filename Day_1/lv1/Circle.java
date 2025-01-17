public class Circle{
    private double radius;

    //Constructor to intialize the radius
    public Circle(double radius){
        this.radius = radius;
    }

    // method to calculate the area of the circle
    public double calculateArea(){
        return Math.PI * radius * radius;
    }

    //Method to calculate the circumference of the circle
    public double calculateCircumference(){
        return  2 * Math.PI * radius;
    }

    //Method to display the area and circumference
    public void displayDetails(){
        System.out.println("Rdaius " + radius);
        System.out.println("Area " + calculateArea());
        System.out.println("Circumfreence " + calculateCircumference());
    }

    public static void main(String []args){
        //Create a circle obj with a radius
        Circle circle = new Circle(7.5);

        circle.displayDetails();
    }
}