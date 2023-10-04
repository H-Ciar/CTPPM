package lab3.numbersystemconversion;

import java.util.Scanner;

public class NumberConversion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number and radix: ");
        String num = input.nextLine();
        System.out.print("Enter the input radix: ");
        int inRadix = input.nextInt();
        System.out.print("Enter the output radix: ");
        int outRadix = input.nextInt();
        try {
            String result = toRadix(num, inRadix, outRadix);
            System.out.println("\"" + num + "\" in radix " + inRadix + " is \"" + result + "\" in radix " + outRadix);
        } catch (NumberFormatException e) {
            System.out.println("error: invalid input");
        }
    }

    // The input and output are treated as String.
    public static String toRadix(String in, int inRadix, int outRadix) {
        int dec = Integer.parseInt(in, inRadix); // convert the input string to decimal using the input radix
        return Integer.toString(dec, outRadix); // convert the decimal number to output string using the output radix
    }
}

