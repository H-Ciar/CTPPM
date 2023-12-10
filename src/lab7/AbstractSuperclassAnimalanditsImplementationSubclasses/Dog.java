package lab7.AbstractSuperclassAnimalanditsImplementationSubclasses;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    /**
     *
     */
    @Override
    void greets() {
        System.out.println("Woof");
    }

    public void greets(Dog anather) {
        System.out.println("Woooof");
    }
}
