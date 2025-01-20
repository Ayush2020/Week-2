class Student{
    public int rollNumber;
    protected String name;
    private double CGPA;

    //Constructor
    public Student(int rollNumber, String name, double CGPA){
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }
    //GEtter Settter
    public double getCGPA(){
        return CGPA;
    }
    public void setCGPA(double CGPA){
        this.CGPA = CGPA;
    }
}
//Subvlass Inherit From Student class
class PostgraduateStudents extends Student{

    public PostgraduateStudents(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }
    public void displayDetails(){
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Name : " + name);
        System.out.println("CGPA : " + getCGPA());
    }
}

public class UniversitymanagementSystem{
    public static void main(String[] args) {
        PostgraduateStudents pg = new PostgraduateStudents(1092, "Tony", 9.3);

        pg.displayDetails();

        pg.setCGPA(9.5);
        System.out.println();

        //Updated  Cgpa
        pg.displayDetails();
    }
}