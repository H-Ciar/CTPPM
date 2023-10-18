package lab5.Animal;

public class Animal {
    private String name;

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    public Animal() {

    }

    public Animal(String name) {
        this.name = name;
    }
}
