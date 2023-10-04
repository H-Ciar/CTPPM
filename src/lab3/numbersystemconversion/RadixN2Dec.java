package lab3.numbersystemconversion;

import java.util.Scanner;

public class RadixN2Dec {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radix: ");
        int radix = input.nextInt();
        input.nextLine(); // consume the newline character
        if (radix > 1 && radix <= 16) {
            System.out.print("Enter the string: ");
            String str = input.nextLine();
            try {
                int dec = radixN2dec(str, radix);
                System.out.println("The equivalent decimal number for \"" + str + "\" is: " + dec);
            } catch (NumberFormatException e) {
                System.out.println("error: invalid string \"" + str + "\" for radix " + radix);
            }
        } else {
            System.out.println("error: invalid radix " + radix);
        }
    }

    public static int radixN2dec(String str, int radix) throws NumberFormatException {
        int dec = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int digit = Character.digit(c, radix); // convert the character to its numeric value in the given radix
            if (digit >= 0 && digit < radix) {
                dec = dec * radix + digit;
            } else {
                throw new NumberFormatException();
            }
        }
        return dec;
    }
}

