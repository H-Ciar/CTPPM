package lab7.AbstractSuperclassAnimalanditsImplementationSubclasses;

public class BigDog extends Dog{
    public BigDog(String name) {
        super(name);
    }

    @Override
    void greets() {
        System.out.println("Wooow");
    }

    @Override
    public void greets(Dog anather) {
        System.out.println("Woooooow");
    }

    void greets(BigDog another) {
        System.out.println("Woooooooow");
    }
}
