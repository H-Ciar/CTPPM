package lab4.themycircleandmypoint;

import lab4.themypoit.MyPoint;

public class MyCircle {
    private MyPoint center;
    private int radius;

    public MyCircle() {
        this.center = new MyPoint(0,0);
        this.radius = 1;
    }

    public MyCircle(int x, int y, int radius) {
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getCenterX() {
        return (int) this.center.getX();
    }

    public void setCenterX(int x) {
        this.center.setX(x);
    }

    public void setCenterY(int y) {
        this.center.setY(y);
    }

    public int getCenterY() {
        return this.center.getY();
    }

    public int[] getCenterXY() {
        int[] rsl = new int[2];
        rsl[0] = this.center.getX();
        rsl[1] = this.center.getY();

        return rsl;
    }

    public void setCenterXY(int x, int y) {
        this.center.setXY(x, y);
    }

    @Override
    public String toString() {
        return "MyCircle{" +
                "center=" + center.toString() +
                ", radius=" + radius +
                '}';
    }

    public double getArea() {
        return (double) this.radius * this.radius * Math.PI;
    }

    public double getCircumference() {
        return (double) 2 * Math.PI * this.radius;
    }

    public double distance(MyCircle another) {
        return (double) this.center.distance(another.center);
    }

}
