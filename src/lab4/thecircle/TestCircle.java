package lab4.thecircle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("The circle has radius of " + circle.getRadius() + " and area of " + circle.getArea());
        System.out.println(circle.toString());

        Circle circle1 = new Circle(2.00);
        System.out.println("The circle has radius of " + circle1.getRadius() + " and area of " + circle1.getArea());

        Circle circle2 = new Circle();
        circle2.setRadius(5.5);
        System.out.println("radius is: " + circle2.getRadius());
        circle2.setColor("green");
        System.out.println("color is: " + circle2.getColor());

        Circle circle3 = new Circle(3.0);
        System.out.println(circle3.toString());
    }
}
