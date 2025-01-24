class Course {
    String courseName;
    int duration;

    //Constructor
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    //Method
    public String displayDetails() {
        return "Course Name: " + courseName + " Duration " + duration + " Months";
    }
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public String displayDetails() {
         String basedetails = super.displayDetails();
        return basedetails + " PlatForm " + platform + " Recorded " + (isRecorded ? "Yes" : "no");
    }
}

class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount;

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public double calculateDiscountedFee() {
        return fee - (fee * discount / 100);
    }

    @Override
    public String displayDetails() {
        String baseDetails = super.displayDetails();
        double discountedFee = calculateDiscountedFee();
        return baseDetails + ", Fee: $" + fee + ", Discount: " + discount + "%" + ", Discounted Fee: $" + String.format("%.2f", discountedFee);
    }
}

public class EducationalCourseHierarchy{
    public static void main(String[] args) {
        // Base class instance
        Course basicCourse = new Course("Introduction to Python", 20);
        System.out.println(basicCourse.displayDetails());

        // Subclass instance
        OnlineCourse onlineCourse = new OnlineCourse("Advanced Python", 30, "Udemy", true);
        System.out.println(onlineCourse.displayDetails());

        // Subclass with extended attributes instance
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Machine Learning", 40, "Coursera", true, 200, 20);
        System.out.println(paidCourse.displayDetails());
    }
}
