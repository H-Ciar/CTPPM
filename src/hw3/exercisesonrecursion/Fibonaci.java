package hw3.exercisesonrecursion;

public class Fibonaci {
    public static int fibonaci(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fibonaci(n-1) + fibonaci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(fibonaci(n));
    }
}
