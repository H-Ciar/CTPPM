package hw3.exercisesonrecursion;

public class NumOfDigits {
    // A helper method to count the number of digits in a positive integer
    public static int numOfDigits(int n) {
        // Base case: n is a single-digit number
        if (n < 10) {
            return 1;
        }
        // Recursive case: n is a multi-digit number
        else {
            return 1 + numOfDigits(n / 10); // Divide n by 10 to remove the last digit
        }
    }

    // A recursive method to compute the length of S(n)
    public static int len(int n) {
        // Base case: n is 1
        if (n == 1) {
            return 1;
        }
        // Recursive case: n is greater than 1
        else {
            return len(n - 1) + numOfDigits(n); // Add the number of digits in n to the length of S(n-1)
        }
    }

    public static void main(String[] args) {
        int n = 12345;
        System.out.println(len(n));
    }


}
