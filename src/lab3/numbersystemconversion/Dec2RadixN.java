package lab3.numbersystemconversion;

import java.util.Scanner;

public class Dec2RadixN {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int dec = input.nextInt();
        System.out.print("Enter the radix: ");
        int radix = input.nextInt();
        if (dec > 0 && radix > 1 && radix <= 16) {
            String str = dec2radixN(dec, radix);
            System.out.println("The equivalent string for decimal \"" + dec + "\" in radix " + radix + " is: " + str);
        } else {
            System.out.println("error: invalid input");
        }
    }

    public static String dec2radixN(int dec, int radix) {
        final String RADIX_DIGITS = "0123456789ABCDEF"; // a string of digits for any radix up to 16
        String str = "";
        while (dec > 0) {
            int rem = dec % radix; // get the remainder of dividing by the radix
            char c = RADIX_DIGITS.charAt(rem); // get the corresponding digit in the given radix
            str = c + str; // prepend the digit to the result
            dec = dec / radix; // update the quotient by dividing by the radix
        }
        return str;
    }
}

