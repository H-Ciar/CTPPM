package lab2.Exercises4;

import java.util.Scanner;

public class Exponent {
    public static void main(String[] args) {
        // Declare variables
        Scanner in = new Scanner(System.in);
        int exp;  // exponent
        int base;  // base

        // Promt and read exponent and base
        System.out.print("Enter the base: ");
        base = in.nextInt();
        System.out.print("Enter the exponent: ");
        exp = in.nextInt();

        // Print result
        System.out.println(base + " raise to the power of " + exp + " is: " + exponent(base, exp));


    }

    private static int exponent(int base, int exp) {
        int product = 1; // resulting product

        // Multipy product and base for exp number of the times
        while (exp > 0) {
            product *= base;
            exp--;
        }

        return product;
    }
}
