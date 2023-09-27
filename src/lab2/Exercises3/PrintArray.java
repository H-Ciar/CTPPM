package lab2.Exercises3;

import java.util.Scanner;

public class PrintArray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int numItems = scan.nextInt();

        int[] items = new int[numItems];

        System.out.print("Enter the values:");
        for(int i=0; i<numItems; i++) {
            items[i] = scan.nextInt();
        }

        System.out.print("The value are : [");
        for(int i=0; i<numItems-1; i++) {
            System.out.print(items[i] + ", ");
        }
        System.out.print(items[numItems-1] + "]");

    }
}
