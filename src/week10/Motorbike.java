public class Motorbike {
    private String code;
    private String name;
    private String manufacturer;
    private int quantity;
    private double price;
    private double weight;
    private String productionDate;

    public Motorbike(String code, String name, String manufacturer, int quantity, double price, double weight, String productionDate) {
        this.code = code;
        this.name = name;
        this.manufacturer = manufacturer;
        this.quantity = quantity;
        this.price = price;
        this.weight = weight;
        this.productionDate = productionDate;
    }

    public void printMotorbike() {
        System.out.println("Mã số: " + code);
        System.out.println("Tên xe: " + name);
        System.out.println("Hãng sản xuất: " + manufacturer);
        System.out.println("Số lượng: " + quantity);
        System.out.println("Giá: " + price);
        System.out.println("Khối lượng: " + weight);
        System.out.println("Ngày sản xuất: " + productionDate);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }
}