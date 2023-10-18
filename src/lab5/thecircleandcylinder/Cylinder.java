package lab5.thecircleandcylinder;

public class Cylinder extends Circle{
    private double height;

    //Contructor with default radius, color and height
    public Cylinder() {
        super();
        this.height = 1.0;
    }

    // COnstructor with default radius, color but given height
    public Cylinder(double height) {
        super();
        this.height = height;
    }

    // Constructor with default color but given raidus and height
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    // A public method for reticving the height
    public double getHeight() {
        return height;
    }

    // A public method for computing the volume of cylinder
    // use supperclass method getArea() to get the base area
    public double getVolume() {
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder: subclass of" + super.toString()
                + "height=" + height +
                '}';
    }
}
