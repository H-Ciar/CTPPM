package lab4.anothercircle;

public class TestMain {
    public static void main(String[] args) {
        // Test Contructer and toString()
        Circle circle1 = new Circle(1.1);
        System.out.println(circle1);
        Circle circle2 = new Circle();
        System.out.println(circle2);

        //Test setter and getter
        circle1.setRadius(2.2);
        System.out.println(circle1);
        System.out.println("radius is: " + circle1.getRadius());

        // Tets getArea and getCircumference
        System.out.println(circle1.getArea());
        System.out.println(circle1.getCircumference());
    }
}
