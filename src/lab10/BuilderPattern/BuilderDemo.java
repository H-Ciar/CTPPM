package lab10.BuilderPattern;

public class BuilderDemo {
    public static void main(String[] args) {
        HouseBuilder builder = new HouseBuilder();
        builder.setBasement("Concrete");
        builder.setStructure("Wood and Brick");
        builder.setRoof("Tile");
        builder.setInterior("Standard");

        House house = builder.getHouse();
        System.out.println(house);
    }
}
