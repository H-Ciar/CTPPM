package lab3.numbersystemconversion;

import java.util.Scanner;

public class Hex2Bin {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal string: ");
        String hex = input.nextLine();
        try {
            String bin = hex2bin(hex);
            System.out.println("The equivalent binary for hexadecimal \"" + hex + "\" is: " + bin);
        } catch (NumberFormatException e) {
            System.out.println("error: invalid hexadecimal string \"" + hex + "\"");
        }
    }

    public static String hex2bin(String hex) throws NumberFormatException {
        final String[] HEX_BITS = {"0000", "0001", "0010", "0011",
                "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011",
                "1100", "1101", "1110", "1111"};
        String bin = "";
        for (int i = 0; i < hex.length(); i++) {
            char c = hex.charAt(i);
            int index = Character.digit(c, 16); // convert the character to its numeric value in base 16
            if (index >= 0 && index < 16) {
                bin += HEX_BITS[index]; // append the corresponding binary string to the result
            } else {
                throw new NumberFormatException();
            }
        }
        return bin;
    }
}

