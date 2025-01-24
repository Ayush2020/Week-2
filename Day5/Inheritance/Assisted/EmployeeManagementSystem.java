class Employee{
    String name;
    String id;
    int salary;

    //Constructor
    public Employee(String name, String id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    //Method
    public void displayDetails(){
        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
        System.out.println("Salary : " + salary);
    }
}

class Manager extends Employee{
    int teamSize;

    public Manager(String name, String id, int salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Team Size : " + teamSize);
    }
}

class Develper extends Employee{
    String programmingLamguage;

    public Develper(String name, String id, int salary, String programmingLamguage) {
        super(name, id, salary);
        this.programmingLamguage = programmingLamguage;
    }
    //Method Overrriding
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Programming Language : " + programmingLamguage);
    }
}


class Intern extends Employee{
    String university;
    //Constructor
    public Intern(String name, String id, int salary, String university) {
        super(name, id, salary);
        this.university = university;
    }
    //MEthod Overriding
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("University : " + university);
    }
}

public class EmployeeManagementSystem{
    public static void main(String[] args) {
        Employee manager = new Manager("Alekh", "AL206", 1000000, 4);
        Employee developer = new Develper("Nikiru Pateru", "A26TY", 200000, "Python");
        Employee intern = new Intern("GAutam ", "AL3389", 400090, "RGPV University");

        System.out.println("manager Details:-");
        manager.displayDetails();

        System.out.println("\nDevelpoer Details: ");
        developer.displayDetails();

        System.out.println("\nIntern Details:");
        intern.displayDetails();
    }
}