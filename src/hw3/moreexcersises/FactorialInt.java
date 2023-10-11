package hw3.moreexcersises;

public class FactorialInt {
    public static void main(String[] args) {
        int n = 1; // the number to compute the factorial
        int fact = 1; // the factorial of n
        boolean overflow = false; // flag to indicate overflow
        while (!overflow) {
            System.out.println("The factorial of " + n + " is " + fact);
            n++; // increment n
            if (Integer.MAX_VALUE / fact < n) { // check for overflow
                overflow = true;
                System.out.println("The factorial of " + n + " is out of range");
            } else {
                fact = fact * n; // update fact
            }
        }
    }
}

