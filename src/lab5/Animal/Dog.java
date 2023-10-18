package lab5.Animal;

public class Dog extends Mammal{
    public Dog(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Woof");
    }
    public void greest(Dog another) {
        System.out.println("Wooof");
    }

    @Override
    public String toString() {
        return "Dog[" + super.toString() + "]";
    }
}
