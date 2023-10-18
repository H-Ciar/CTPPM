package lab4.themypoit;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int[] getXY() {
        int[] result = new int[2];
        result[0] = this.x;
        result[1] = this.y;

        return result;
    }

    @Override
    public String toString() {
        return "MyPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double distance(int x, int y) {
        double distance;
        distance = Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2));

        return distance;
    }

    public double distance(MyPoint another) {
        double distance;
        distance = another.distance(this.x, this.y);

        return distance;
    }

    public double distance() {
        double distance;
        distance = Math.sqrt(x * x + y * y);

        return distance;
    }


}
