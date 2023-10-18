package lab4.theilineandmypoint;

import lab4.themypoit.MyPoint;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }

    public void setBeginX(int x) {
        this.begin.setX(x);
    }

    public void setBeginY(int y) {
        this.begin.setY(y);
    }

    public void setEndX(int x) {
        this.end.setX(x);
    }

    public void setEndY(int y) {
        this.end.setY(y);
    }

    public int getBeginX() {
        return begin.getX();
    }

    public int getBenginY() {
        return begin.getY();
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    public void setBegin(int x, int y) {
        begin.setXY(x, y);
    }

    public void setEnd(int x, int y)  {
        end.setXY(x, y);
    }


    public int[] getBeginXY() {
        return begin.getXY();
    }

    public int[] getEndXY() {
        return end.getXY();
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    public double getLength() {
        return (double) this.begin.distance(end);
    }

    @Override
    public String toString() {
        return "MyLine{" +
                "begin=" + begin +
                ", end=" + end +
                '}';
    }
}
