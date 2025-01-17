public class Employee{
    //Declare the attribute of the class
    private String name;
    private String id;
    private double salary;

    //Constructorr to intialize the attributes
    public Employee(String name, String id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;

    }
    //Method to display the details
    public void displayDetails(){
        System.out.println("Employee name: " + name);
        System.out.println("Employee id : " + id);
        System.out.println("Employee salary: " + salary);
    }
    //Main method to test class
    public static void main(String []args){
        //Create ann employee  object
        Employee employee1 = new Employee("XYZ", "Z12334", 10000.0 );

        employee1.displayDetails();
    }

}