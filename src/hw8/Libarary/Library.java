package hw8.Libarary;

public class Library {
    private Rent[] library;

    public Library(Rent[] library) {
        this.library = library;
    }

    public Rent getLongestRent() {
        Rent longest = null;
        for (Rent rent : library) {
            if (longest == null) {
                longest = rent;
            }
        }
        return longest;
    }
}
