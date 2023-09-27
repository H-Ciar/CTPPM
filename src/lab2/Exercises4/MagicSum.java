package lab2.Exercises4;

import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;

        System.out.print("Enter a positive integer (or -1 to end): ");
        number = scanner.nextInt();

        while (number != -1) {
            if (hasEight(number)) {
                sum += number;
            }
            System.out.print("Enter a positive integer (or -1 to end): ");
            number = scanner.nextInt();
        }

        System.out.println("The magic sum is: " + sum);

    }

    public static boolean hasEight(int number) {
        while (number > 0) {
            if (number % 10 == 8) {
                return true;
            }
            number /= 10;
        }
        return false;
    }

}
