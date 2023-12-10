package week11;

public class Student {
    private String hovaten;
    private double diem;

    public Student(String hoten, double diemthi) {
        this.hovaten = hoten;
        this.diem = diemthi;
    }

    public double getDiem() {
        return this.diem;
    }

    public void printStudent() {
        System.out.println(hovaten + diem);
    }
}
