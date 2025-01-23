import java.util.ArrayList;
import java.util.List;

class Department2 {
    private String departmentName;
    private String departmentCode;
    private List<UniversityMember> members;

    public Department2(String departmentName, String departmentCode) {
        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
        this.members = new ArrayList<>();
    }

    // Method to add a member to the department
    public void addMember(UniversityMember member) {
        members.add(member);
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public List<UniversityMember> getMembers() {
        return members;
    }
}

class Lecturer {
    private String name;
    private String id;
    private List<Department2> departmentsTaught;

    // Constructor
    public Lecturer(String name, String id) {
        this.name = name;
        this.id = id;
        this.departmentsTaught = new ArrayList<>();
    }

    // Method to assign a department to the lecturer
    public void assignDepartment(Department2 department) {
        departmentsTaught.add(department);
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public List<Department2> getDepartmentsTaught() {
        return departmentsTaught;
    }
}

class UniversityMember {
    private String name;
    private String id;

    public UniversityMember(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}

public class UniversityManagement {
    public static void main(String[] args) {

        Department2 csDepartment = new Department2("Computer Science", "CS101");
        Department2 mathDepartment = new Department2("Mathematics", "MATH102");

        Lecturer drSmith = new Lecturer("Dr. Smith", "L001");
        Lecturer drJohnson = new Lecturer("Dr. Johnson", "L002");

        drSmith.assignDepartment(csDepartment);
        drJohnson.assignDepartment(mathDepartment);

        UniversityMember member1 = new UniversityMember("Gautam", "AL213");
        UniversityMember member2 = new UniversityMember("Ayush", "AL211");

        csDepartment.addMember(member1);
        mathDepartment.addMember(member2);

        System.out.println("Departments in the University:");
        for (Department2 department : List.of(csDepartment, mathDepartment)) {
            System.out.println("Department: " + department.getDepartmentName() + " (" + department.getDepartmentCode() + ")");
            for (UniversityMember member : department.getMembers()) {
                System.out.println("Member: " + member.getName() + " (" + member.getId() + ")");
            }
        }
    }
}