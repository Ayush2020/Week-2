public class UniversityStudentMgmt {
    public static void main(String[] args) {
        Students std1 = new Students("Gautam",101,"a+");
        Students std2 = new Students("Rahul",102,"c+");
        Students std3 = new Students("Suhani", 103 , "a++");

        Students.setUniversityNames("Technocrats Institute Of Technolgy");
        Students.displayTotalStudents();

        std1.getDetails();
        System.out.println("\n");
        std2.getDetails();
        System.out.println("\n");
        std3.getDetails();

    }
}

class Students {
    private static int totalStudents = 0;
    private static String universityNames;
    private String name;
    private final int rollNumber;
    private String grade;

    //constructor
    public  Students(String name, int rollNumber, String grade){
        this.name= name;
        this.rollNumber =rollNumber;
        this.grade =grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("total students enrolled are " + totalStudents);
    }

    public static void setUniversityNames(String newUnivNames) {
        universityNames =newUnivNames;
    }

    public void getDetails() {
        System.out.println("name is "+ name);
        System.out.println("roll number is "+ rollNumber);
        System.out.println("grade is "+ grade);
        System.out.println("university name is "+ universityNames);
    }


}