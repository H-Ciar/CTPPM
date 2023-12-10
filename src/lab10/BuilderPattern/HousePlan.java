package lab10.BuilderPattern;

public interface HousePlan {
    void setBasement(String basement);
    void setStructure(String structure);
    void setRoof(String roof);
    void setInterior(String interior);

    House getHouse();
}
