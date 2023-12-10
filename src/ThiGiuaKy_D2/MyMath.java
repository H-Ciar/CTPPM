package ThiGiuaKy_D2;

import java.io.FileWriter;
import java.io.IOException;

public class MyMath {

    public static void main(String[] args) {

        double x = 2.2;
        double y = 3.3;

        double eToX = exp(x);
        double cosY = cos(y);

        double result = eToX * cosY;

        String number = "123456789123456789";
        int inRadix = 13;
        int outRadix = 8;

        String convertedNumber = toRadix(number, inRadix, outRadix);

        // Lưu kết quả vào file
        try {
            FileWriter writer = new FileWriter("MyMath1234.txt");
            writer.write("e^" + x + " = " + eToX + "\n");
            writer.write("cos(" + y + ") = " + cosY + "\n");
            writer.write("e^" + x + " * cos(" + y + ") = " + result + "\n");
            writer.write("Number " + number + " converted from base " + inRadix + " to base " + outRadix + ": " + convertedNumber);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    // Các hàm xử lý
    public static double exp(double x) {
        double term = 1;
        double sum = 1;
        int i = 1;
        while (Math.abs(term) > 0.00001) {
            term = power(x, i) / factorial(i);
            sum += term;
            i++;
        }
        return sum;
    }

    public static double cos(double x) {
        double term = 1;
        double sum = 1;
        int i = 2;
        while (Math.abs(term) > 0.00001) {
            term = power(x, i) / factorial(i);
            if (i % 4 == 0) {
                sum += term;
            } else {
                sum -= term;
            }
            i += 2;
        }
        return sum;
    }

    public static String toDecimal(String number, int inRadix) {
        // Sử dụng phương pháp Horner
        int n = number.length();
        double decimal = 0;
        int radix = inRadix;
        String digits = "0123456789ABCDEF";
        for (int i = 0; i < n; i++) {
            char c = number.charAt(i);
            int digit = digits.indexOf(c);
            decimal = decimal * radix + digit;
        }
        return String.valueOf(decimal);
    }


    public static String decimalTo(String number, int outRadix) {
        // Sử dụng thuật toán Euclid
        double decimal = Double.parseDouble(number);
        int radix = outRadix;
        String digits = "0123456789ABCDEF";
        StringBuilder converted = new StringBuilder();
        while (decimal > 0) {
            int digit = (int) (decimal % radix);
            converted.insert(0, digits.charAt(digit));
            decimal = Math.floor(decimal / radix);
        }
        return converted.toString();
    }


    public static String toRadix(String number, int inRadix, int outRadix) {
        String decimal = toDecimal(number, inRadix);
        return decimalTo(decimal, outRadix);
    }

    public static double factorial(int n) {
        double fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static double power(double x, int n) {
        double pow = 1;
        for (int i = 1; i <= n; i++) {
            pow *= x;
        }
        return pow;
    }

}