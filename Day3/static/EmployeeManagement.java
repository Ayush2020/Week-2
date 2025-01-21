class Employee{
    static String companyname = " GOW Solutions ";
    static  int totalEmployee = 0;
    final String id;

    String name ;
    String designation;

    //Constructor
    public Employee(String name, String id, String designation){
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployee++;
    }

    //static method to display the total number of employess
    public static void displayTotalEmployee(){
        System.out.println("Total Employes : " + totalEmployee);
    }

    public void displayEmployeeDetails(){
        if (this instanceof Employee){
            System.out.println("Employee Name : " + name);
            System.out.println("Employee ID : " + id);
            System.out.println("DEsignation : " + designation);
            System.out.println("Company Name : " + companyname);
        }
    }
}

public class EmployeeManagement{
    public static void main(String[] args) {
        Employee employee1 = new Employee("Bruce Banner", "EM123453", "HR");
        Employee employee2 = new Employee("Wanda", "E12321", "MAnager");

        Employee.displayTotalEmployee();

        // Displaying the details of individual employees
        employee1.displayEmployeeDetails();
        System.out.println();
        employee2.displayEmployeeDetails();
    }
}