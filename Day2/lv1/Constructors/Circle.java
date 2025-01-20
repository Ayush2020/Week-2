public class Circle{
    private double radius;

    public Circle(){
        this(10.9);
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    //getter method
    public double getRadius(){
        return radius;
    }

    //setter method
    public void setRadius(){
        this.radius = radius;
    }

    @Override
    public String toString(){
        return "Radius of circle " + radius;
    }

    public static void main(String[] args) {
        Circle defaultradius = new Circle();
        Circle radius1 = new Circle(5.0);

        System.out.println(defaultradi);
        System.out.println(radius1);
    }

}