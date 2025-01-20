public class Course {
    // Instance variables
    private String courseName;
    private int duration;
    private double fee;

    // Class variable common for all courses
    private static String instituteName = "ABC Online Institute";

    // Constructor to initialize course details
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: $" + fee);
        System.out.println("Institute Name: " + instituteName);
    }

    // Class method to update the institute name for all courses
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
        System.out.println("Institute name updated to: " + instituteName);
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        // Creating Course objects
        Course course1 = new Course("Java Programming", 3, 299.99);
        Course course2 = new Course("Data Science", 6, 499.99);
        Course course3 = new Course("Web Development", 4, 399.99);

        // Course details
        System.out.println("Course 1 Details:");
        course1.displayCourseDetails();
        System.out.println();

        System.out.println("Course 2 Details:");
        course2.displayCourseDetails();
        System.out.println();

        System.out.println("Course 3 Details:");
        course3.displayCourseDetails();
        System.out.println();

        // Updating the institute name for all courses
        Course.updateInstituteName("ABC  Academy");

        //  updated course details
        System.out.println("\nAfter Institute Name Update:");
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
        System.out.println();
        course3.displayCourseDetails();
    }
}
