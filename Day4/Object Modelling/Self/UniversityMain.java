// Faculty class
class Faculty {
    private String name;

    // Constructor to initialize faculty name
    public Faculty(String name) {
        this.name = name;
        System.out.println("Faculty created: " + this.name);
    }

    // Getter for faculty name
    public String getName() {
        return this.name;
    }
}

// Department1 class
class Department1 {
    private String name;
    private Faculty[] faculties;

    // Constructor to initialize department name and faculties
    public Department1(String name, Faculty[] faculties) {
        this.name = name;
        this.faculties = faculties;
        System.out.println("Department created: " + this.name);
        for (Faculty f : faculties) {
            System.out.println("Faculty in department: " + f.getName());
        }
    }

    // Getter for department name
    public String getName() {
        return this.name;
    }
}

// University class
class University {
    private Department1[] departments;

    // Constructor to initialize departments
    public University(Department1[] departments) {
        this.departments = departments;
        System.out.println("University created");
        for (Department1 d : departments) {
            System.out.println("Department in university: " + d.getName());
        }
    }

    // Method to display departments
    public void getDepartments() {
        for (Department1 d : departments) {
            System.out.println("Department in university: " + d.getName());
        }
    }
}

// Main class to test the program
public class UniversityMain {
    public static void main(String[] args) {
        // Create faculties
        Faculty f1 = new Faculty("Tony");
        Faculty f2 = new Faculty("Steve");

        // Create departments with faculties
        Department1 d1 = new Department1("Social Science", new Faculty[]{f1, f2});
        Department1 d2 = new Department1("Science", new Faculty[]{f2});

        // Create university with departments
        University u = new University(new Department1[]{d1, d2});

        // Display university departments
        u.getDepartments();
    }
}