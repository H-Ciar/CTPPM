package lab3.numbersystemconversion;

import java.util.Scanner;

public class Oct2Dec {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Octal string: ");
        String oct = input.nextLine();
        try {
            int dec = oct2dec(oct);
            System.out.println("The equivalent decimal number for octal \"" + oct + "\" is: " + dec);
        } catch (NumberFormatException e) {
            System.out.println("error: invalid octal string \"" + oct + "\"");
        }
    }

    public static int oct2dec(String oct) throws NumberFormatException {
        int dec = 0;
        for (int i = 0; i < oct.length(); i++) {
            char c = oct.charAt(i);
            if (c >= '0' && c <= '7') {
                dec = dec * 8 + (c - '0');
            } else {
                throw new NumberFormatException();
            }
        }
        return dec;
    }
}

