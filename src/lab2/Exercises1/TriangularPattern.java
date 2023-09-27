package lab2;

import java.util.Scanner;

public class TriangularPattern {
    public static void PatternA(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row >= col) {
                    System.out.print("#");
                } else {
                    System.out.println(" ");
                }
            }
            System.out.println();
        }
    }

    public static void PatternB(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row + col <= n + 1) {
                    System.out.print("#");
                } else {
                    System.out.println(" ");
                }
            }
            System.out.println();
        }
    }


    public static void PatternC(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row >= col) {
                    System.out.print("#");
                } else {
                    System.out.println(" ");
                }
            }
            System.out.println();
        }
    }

    public static void PatternD(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row + col >= n + 1) {
                    System.out.print("#");
                } else {
                    System.out.println(" ");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        PatternA(3);
        PatternB(3);
        PatternC(3);
        PatternD(3);
    }
}
