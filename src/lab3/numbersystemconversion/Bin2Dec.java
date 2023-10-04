package lab3.numbersystemconversion;

import java.util.Scanner; // import thư viện Scanner để nhập dữ liệu từ bàn phím

public class Bin2Dec {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // tạo đối tượng input thuộc lớp Scanner
        System.out.print("Enter a Binary string: "); // in ra màn hình yêu cầu nhập chuỗi nhị phân
        String bin = input.nextLine(); // lấy chuỗi nhị phân từ bàn phím và gán cho biến bin
        try {
            int dec = bin2dec(bin); // gọi hàm bin2dec để chuyển đổi chuỗi nhị phân thành số thập phân và gán cho biến dec
            System.out.println("The equivalent decimal number for binary \"" + bin + "\" is: " + dec); // in ra kết quả chuyển đổi
        } catch (NumberFormatException e) {
            System.out.println("error: invalid binary string \"" + bin + "\""); // nếu chuỗi nhị phân không hợp lệ, bắt lỗi và in ra thông báo
        }
    }

    public static int bin2dec(String bin) throws NumberFormatException { // định nghĩa hàm bin2dec với tham số là chuỗi nhị phân và có thể ném ra ngoại lệ NumberFormatException
        int dec = 0; // khởi tạo biến dec là số thập phân bằng 0
        for (int i = 0; i < bin.length(); i++) { // duyệt qua từng ký tự trong chuỗi nhị phân
            char c = bin.charAt(i); // lấy ký tự tại vị trí i và gán cho biến c
            if (c == '0' || c == '1') { // nếu ký tự là 0 hoặc 1
                dec = dec * 2 + (c - '0'); // cập nhật giá trị của dec bằng cách nhân 2 và cộng với giá trị số của ký tự
            } else {
                throw new NumberFormatException(); // nếu ký tự không phải là 0 hoặc 1, ném ra ngoại lệ NumberFormatException
            }
        }
        return dec; // trả về giá trị của dec là số thập phân tương ứng
    }
}
