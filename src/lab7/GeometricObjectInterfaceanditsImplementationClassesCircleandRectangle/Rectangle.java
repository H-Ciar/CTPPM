package lab7.GeometricObjectInterfaceanditsImplementationClassesCircleandRectangle;

public class Rectangle implements GeometricObject{
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle[" +
                "width=" + width +
                ", length=" + length +
                ']';
    }

    /**
     * @return
     */
    @Override
    public double getArea() {
        return width * length;
    }

    /**
     * @return
     */
    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }
}
