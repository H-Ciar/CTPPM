package lab3.numbersystemconversion;

import java.util.Scanner;

public class Dec2Hex {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int dec = input.nextInt();
        if (dec > 0) {
            String hex = dec2hex(dec);
            System.out.println("The equivalent hexadecimal number is " + hex);
        } else {
            System.out.println("error: invalid decimal number " + dec);
        }
    }

    public static String dec2hex(int dec) {
        final String HEX_DIGITS = "0123456789ABCDEF"; // a string of hexadecimal digits
        String hex = "";
        while (dec > 0) {
            int rem = dec % 16; // get the remainder of dividing by 16
            char c = HEX_DIGITS.charAt(rem); // get the corresponding hexadecimal digit
            hex = c + hex; // prepend the digit to the result
            dec = dec / 16; // update the quotient by dividing by 16
        }
        return hex;
    }
}

