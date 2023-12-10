package week11;

public class TestMyComplex {
    public static void main(String[] args) {
        // Tạo hai số phức
        MyComplex complex1 = new MyComplex(2.0, 3.0);
        MyComplex complex2 = new MyComplex(4.0, -1.0);

        // In thông tin số phức
        System.out.println("Số phức 1: " + complex1.toString());
        System.out.println("Số phức 2: " + complex2.toString());

        // Kiểm tra tính bằng nhau của hai số phức
        System.out.println("Hai số phức bằng nhau? " + complex1.equals(complex2));

        // Tính độ lớn của số phức
        System.out.println("Độ lớn của số phức 1: " + complex1.magnitude());
        System.out.println("Độ lớn của số phức 2: " + complex2.magnitude());

        // Cộng số phức 2 vào số phức 1
        complex1.addInto(complex2);
        System.out.println("Sau khi cộng số phức 2 vào số phức 1: " + complex1.toString());

        // Tạo một số phức mới là tổng của hai số phức
        MyComplex sumComplex = complex1.addNew(complex2);
        System.out.println("Tổng của hai số phức: " + sumComplex.toString());

        // Kiểm tra số phức có phải số ảo hay không
        System.out.println("Số phức 1 là số ảo? " + complex1.isImaginary());
        System.out.println("Số phức 2 là số ảo? " + complex2.isImaginary());

        // Kiểm tra số phức có phải số thực hay không
        System.out.println("Số phức 1 là số thực? " + complex1.toReal());
        System.out.println("Số phức 2 là số thực? " + complex2.toReal());

        // Thiết lập giá trị mới cho số phức
        complex1.setValue(1.0, 1.0);
        System.out.println("Số phức 1 sau khi thiết lập giá trị mới: " + complex1.toString());
    }
}