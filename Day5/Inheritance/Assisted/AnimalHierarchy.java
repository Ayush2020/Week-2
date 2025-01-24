

class Animal{
    String name;
    int age;

    //Constructor
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Method
    public void makeSound(){
        System.out.println("Animal Sounds: ");
    }
}

class Dog extends Animal{
    //Constructor 

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound(){
        System.out.println(name + " Bhaw Bhaw!!!");
    }
}

class Cat extends Animal{
    //Constructor

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " Meow Meow");
    }
}

class Bird extends Animal{
    //Constructor

    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " Chirr Chirr!!!!");
    }
}

public class AnimalHierarchy{
    public static void main(String[] args) {
        //objects of the class
        Animal dog = new Dog("jimmy", 12);
        Animal cat = new Cat("Billi", 5);
        Animal bird = new Bird("Tailow", 3);


        //polymorphism calling make sound on each instances
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}