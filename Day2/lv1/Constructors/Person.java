public class Person{
    private int age;
    private String name;
    private int id;


    //Parameterized Constructor
    public Person(String name, int age, int id){
        this.name = name;
        this.age = age;
        this.id = id;
    }

    //Copy Constructor
    public Person(Person clone){
        this.name = clone.name;
        this.age = clone.age;
        this.id = clone.id;
    }

    //getter method
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getId(){
        return id;
    }

    //setter method

    public void setName(){
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public String toString(){
        return "Name " + name + "\nAge " + age + "\nId " + id;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Rohit", 24 , 0111);
        Person person2 = new Person(person1);

        System.out.println(person1);
        System.out.println(person2);
    }
}
