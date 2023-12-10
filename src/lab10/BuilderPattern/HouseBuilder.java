package lab10.BuilderPattern;

public class HouseBuilder implements HousePlan {

    private House house;

    public HouseBuilder() {
        this.house = new House();
    }

    public void setBasement(String basement) {
        house.basement = basement;
    }

    public void setStructure(String structure) {
        house.structure = structure;
    }

    public void setRoof(String roof) {
        house.roof = roof;
    }

    public void setInterior(String interior) {
        house.interior = interior;
    }

    public House getHouse() {
        return this.house;
    }
}
