import java.util.ArrayList;
import java.util.List;

abstract class Employee{
    private int employeeId;
    private String name;
    private double baseSalary;

    //Constructor
    public Employee(int employeeId, String name, double baseSalary){
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    //Abstract method
    public abstract double calculateSalary();

    //Concrete Method
    public void displayDetails(){
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name : " + name);
        System.out.println("BAse Salary : " + baseSalary);
        System.out.println("Calculated Salary : " + calculateSalary());
    }

    //Getter and Setter(Encapsulation)

    public int getEmployeeId(){
        return employeeId;
    }

    public void setEmployeeId(int employeeId){
        this.employeeId = employeeId;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}

class FullTimeEmployee extends Employee{
    public FullTimeEmployee(int employeeId, String name, double baseSalary){
        super(employeeId, name, baseSalary);
    }
    @Override
    public double calculateSalary(){
        return getBaseSalary();
    }
}

class PartTimeEmployee extends Employee{

    private int hoursWorked;
    public PartTimeEmployee(int employeeId, String name, double baseSalary, int hoursWorked){
        super(employeeId, name, baseSalary);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() * hoursWorked;
    }
    //Getter Setter
    public int getHoursWorked(){
        return hoursWorked;
    }
    public void setHoursWorked(){
        this.hoursWorked = hoursWorked;
    }
}

interface Department{
    void assignDepartment(String departmentName);
    String getDepartmentDetails();
}

class HRDepartment implements Department{
    private String departmentName;

    @Override
    public void assignDepartment(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department:" + departmentName;
    }
}



public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Creating employees
        Employee fullTimeEmployee = new FullTimeEmployee(1234, "Tony", 10000);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(2132, "Steve", 16590, 120);

        // Display details
        fullTimeEmployee.displayDetails();
        partTimeEmployee.displayDetails();

        // Example of department assignment
        HRDepartment hrDepartment = new HRDepartment();
        hrDepartment.assignDepartment("Human Resources");

        System.out.println("\n" + hrDepartment.getDepartmentDetails());

        // List of employees for polymorphism
        List<Employee> employees = new ArrayList<>();
        employees.add(fullTimeEmployee);
        employees.add(partTimeEmployee);

        System.out.println("\nDisplaying all employee details using polymorphism:");
        for (Employee employee : employees) {
            employee.displayDetails();
        }
    }
}
