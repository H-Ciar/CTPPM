package lab5.ThePointAndLine;

public class LineSub extends Point{
    Point end;

    public LineSub(int beginX, int beginY, int endX,int endY) {
        super(beginX, beginX);
        this.end = new Point(endX, endY);
    }

    public LineSub(Point begin, Point end) {
        super(begin.getX(), begin.getY());
        this.end = end;
    }





    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Line{" +
                ", end=" + end +
                '}';
    }





    public void setEndX(int x) {
        end.setX(x);
    }

    public void setendY(int y) {
        end.setY(y);
    }

    public Point getBegin() {
        Point rs = new Point(super.getX(), super.getY());
        return rs;
    }

    public void setBegin(Point begin) {
        super.setXY(begin.getX(), begin.getY());
    }

    public int getBeginX() {
        return super.getX();
    }

    public int getBeginY() {
        return super.getY();
    }

    public void setBeginX(int x) {
        super.setX(x);
    }

    public void setBeginY(int y) {
        super.setY(y);
    }



    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    public void setBeginXY(int x, int y) {
        super.setXY(x, y);
    }

    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    public int getLength() {
        int xDiff = end.getX() - super.getX();
        int yDiff = end.getY() - super.getY();
        return (int) Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    public double getGradient() {
        int xDiff = end.getX() - super.getX();
        int yDiff = end.getY() - super.getY();
        return (double) Math.atan2(yDiff, xDiff);
    }
}

