import java.util.ArrayList;


class Employee{
    private String name;
    private String employeeId;

    //Constructor
    public Employee(String name, String employeeId){
        this.name = name;
        this.employeeId = employeeId;

    }

    //Method
    public void displayEmployeeDetails(){
        System.out.println("Employee Name: " + name + " Employee ID : "  + employeeId);
    }
}


class Department {
    private String departmentName;
    private ArrayList<Employee> employees; // Composition

    // Constructor
    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    // Method
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Method
    public void displayDepartmentDetails() {
        System.out.println("Department: " + departmentName);
        for (Employee employee : employees) {
            employee.displayEmployeeDetails();
        }
    }

    // Method (composition)
    public void clearEmployees() {
        employees.clear();
    }
}


class Company {
    private String companyName;
    private ArrayList<Department> departments; // Composition

    // Constructor
    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    // Method
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Method
    public void displayCompanyDetails() {
        System.out.println("Company: " + companyName);
        for (Department department : departments) {
            department.displayDepartmentDetails();
        }
    }

    // Method
    public void clearDepartments() {
        for (Department department : departments) {
            department.clearEmployees();
        }
        departments.clear();
    }
}


public class CompanyAndDepartments{
    public static void main(String[] args) {
        // Create employees objects
        Employee employee1 = new Employee("Raju", "AE4003");
        Employee employee2 = new Employee("Babu Rao", "AE2034");
        Employee employee3 = new Employee("Shayam", "AE2003");

        // Create departments
        Department department1 = new Department("HR");
        Department department2 = new Department("IT");

        // Add employees to departments
        department1.addEmployee(employee1);
        department1.addEmployee(employee2);
        department2.addEmployee(employee3);

        // Create company
        Company company = new Company("Laxmi Chit Funds");

        // Add departments to company
        company.addDepartment(department1);
        company.addDepartment(department2);

        // Display company details
        System.out.println("Before deleting company:");
        company.displayCompanyDetails();


        company.clearDepartments();

        System.out.println("\nAfter deleting company:");
        company.displayCompanyDetails();
    }
}
