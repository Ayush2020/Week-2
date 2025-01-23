import java.util.ArrayList;

class Course {
    private String courseName;
    private ArrayList<Student> students; // Association with students

    // Constructor to initialize course name
    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    // Method to enroll a student in the course
    public void enrollStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    // Method to display course details and the list of enrolled students
    public void displayCourseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Enrolled Students:");
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }

    public boolean getCourseName() {
        return false;
    }
}


class Student {
    private String name;
    private String studentId;
    private ArrayList<Course> courses; // Association with courses

    // Constructor to initialize student details
    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
        this.courses = new ArrayList<>();
    }

    // Method to enroll in a course
    public void enrollInCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.enrollStudent(this); // Enroll the student in the course as well
        }
    }

    // Method to display student details and the list of courses
    public void displayStudentDetails() {
        System.out.println("Student: " + name + " (ID: " + studentId + ")");
        System.out.println("Enrolled Courses:");
        for (Course course : courses) {
            System.out.println(course.getCourseName());
        }
    }

    // Getter for name
    public String getName() {
        return name;
    }
}

class School {
    private String schoolName;
    private ArrayList<Student> students; // Aggregation with students

    // Constructor to initialize school name
    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    // Method to add a student to the school
    public void addStudent(Student student) {
        students.add(student);
    }

    // Method to display school details and its students
    public void displaySchoolDetails() {
        System.out.println("School: " + schoolName);
        System.out.println("Students:");
        for (Student student : students) {
            student.displayStudentDetails();
        }
    }
}


public class SchoolAndStudents {
    public static void main(String[] args) {
        // Create courses
        Course course1 = new Course("Math 101");
        Course course2 = new Course("Science 101");
        Course course3 = new Course("History 101");

        // Create students
        Student student1 = new Student("Raju", "S001");
        Student student2 = new Student("Shyam", "S002");

        // Create school
        School school = new School("Stanley University");

        // Add students to the school
        school.addStudent(student1);
        school.addStudent(student2);

        // Enroll students in courses
        student1.enrollInCourse(course1);
        student1.enrollInCourse(course2);
        student2.enrollInCourse(course2);
        student2.enrollInCourse(course3);

        // Display school details
        school.displaySchoolDetails();

        // Display course details
        course1.displayCourseDetails();
        course2.displayCourseDetails();
        course3.displayCourseDetails();
    }
}
