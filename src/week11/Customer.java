package week11;

public class Customer {
    private int id;
    private String name;
    private int discount;

    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }



    @Override
    public String toString() {
        return name + "(" + id + ")(" + discount/100 + "%)";
    }

    public int getID() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDiscount() {
        return discount/100;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
