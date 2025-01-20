class Employee {

    public int employeeID;

    protected String department;

    private double salary;

    // Constructor t
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // getter
    public double getSalary() {
        return this.salary;
    }

    // setter
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to display employee details (used by the Manager class)
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}

// Subclass Manager inherits employye class
class Manager extends Employee {

    // Constructor
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);  // Call the superclass constructor
    }


    public void displayManagerDetails() {
        System.out.println("Manager Details:");
        System.out.println("Employee ID: " + employeeID);  // Accessing public field 'employeeID'
        System.out.println("Department: " + department);  // Accessing protected field 'department'
        System.out.println("Salary: $" + getSalary());  // Accessing 'salary' via public method
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee employee = new Employee(17648282, "IT", 55000.00);


        System.out.println("Employee Details:");
        employee.displayEmployeeDetails();

        // Modifying salary using public method
        employee.setSalary(60000);

        // Displaying updated employee details
        System.out.println("\nUpdated Employee Details:");
        employee.displayEmployeeDetails();


        Manager manager = new Manager(188627832, "HR", 1000000);

        // Displaying manager details
        manager.displayManagerDetails();
        manager.setSalary(85000);


        System.out.println("\nUpdated Manager Details:");
        manager.displayManagerDetails();
    }
}
