package lab7.GeometricObjectInterfaceanditsImplementationClassesCircleandRectangle;

public class Circle implements GeometricObject{
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle[" +
                "radius=" + radius +
                ']';
    }

    /**
     * @return
     */
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * @return
     */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
