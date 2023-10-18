package lab5.Animal;

public class Mammal extends Animal{
    public Mammal(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Mammal" + "[" + super.toString() + "]";
    }
}
