package lab4.therectangle;

public class TestMain {
    public static void main(String[] args) {
        // Test constructer and toString()
        // You nedd to append a 'f' or 'F' to a float literal
        Rectangle rectangle1 = new Rectangle(1.2f, 1.2f);
        System.out.println(rectangle1);

        Rectangle rectangle2 = new Rectangle();
        System.out.println(rectangle2);

        // Test setter and getter
        rectangle1.setLength(5.6f);
        rectangle1.setWidth(7.8f);
        System.out.println(rectangle1);
        System.out.println(rectangle1.getLength());
        System.out.println(rectangle1.getWidth());

        // Test getArea() and getPerimeter
        System.out.printf("%.2f%n", rectangle1.getArea());
        System.out.printf("%.2f%n", rectangle1.getPerimeter());

    }
}
