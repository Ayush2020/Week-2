class Person{
    String name;
    String id;
    public Person(String name, String id){
        this.name = name;
        this.id = id;
    }
}

interface Worker{
    void performDuties();
}
class Chef extends Person implements Worker{

    public Chef(String name, String id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " Preparing Dishes in the Kitchen ");
    }
}

class Waiter extends Person implements Worker{

    public Waiter(String name, String id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " Serving Dishes in the Restaurant.");
    }
}

public class RestaurantManagementSystem{
    public static void main(String[] args) {
        Chef chef = new Chef("Durgesh","21");
        Waiter waiter = new Waiter("kajal", "20");

        chef.performDuties();
        waiter.performDuties();
    }
}