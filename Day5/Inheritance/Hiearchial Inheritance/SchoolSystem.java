class Person{
    String name;
    int age;
    //Constructor
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void displayRole(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}

class Teacher extends Person{
    String subject;
    //Constructor
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void displayRole() {
        super.displayRole();
        System.out.println("Subject : " + subject);
    }
}

class Student extends Person{
    String grade;
    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public void displayRole(){
        super.displayRole();
        System.out.println("Grade: " + grade);
    }
}

class Staff extends Person{
    String position;

    public Staff(String name, int age, String position) {
        super(name, age);
        this.position = position;
    }

    @Override
    public void displayRole() {
        super.displayRole();
        System.out.println("Staff Position : " + position);
    }
}

public class SchoolSystem{
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mr Rajesh laxman",35,"Chemistry");
        Student student = new Student("Anamika",18,"B");
        Staff staff = new Staff("Yashika",21,"Principal");

        System.out.println("Teacher Details:");
        teacher.displayRole();
        System.out.println();

        System.out.println("Student details:");
        student.displayRole();
        System.out.println();

        System.out.println("Staff Details:");
        staff.displayRole();
        
    }
}