package hw3.exercisesonrecursion;

public class GCD {
    // A recursive method to compute the GCD of two given integers
    public static int gcd(int a, int b) {
        // Base case: if b is zero, return a
        if (b == 0) {
            return a;
        }
        // Recursive case: otherwise, return gcd(b, a % b)
        else {
            return gcd(b, a % b);
        }
    }

}
