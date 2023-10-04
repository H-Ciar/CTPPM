package lab3.numbersystemconversion;

import java.util.Scanner;

public class Hex2Dec {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal string: ");
        String hex = input.nextLine();
        try {
            int dec = hex2dec(hex);
            System.out.println("The equivalent decimal number for hexadecimal \"" + hex + "\" is: " + dec);
        } catch (NumberFormatException e) {
            System.out.println("error: invalid hexadecimal string \"" + hex + "\"");
        }
    }

    public static int hex2dec(String hex) throws NumberFormatException {
        int dec = 0;
        for (int i = 0; i < hex.length(); i++) {
            char c = hex.charAt(i);
            if (c >= '0' && c <= '9') {
                dec = dec * 16 + (c - '0');
            } else if (c >= 'A' && c <= 'F') {
                dec = dec * 16 + (c - 'A' + 10);
            } else if (c >= 'a' && c <= 'f') {
                dec = dec * 16 + (c - 'a' + 10);
            } else {
                throw new NumberFormatException();
            }
        }
        return dec;
    }
}

