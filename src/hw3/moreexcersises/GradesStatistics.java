package hw3.moreexcersises;

import java.util.Scanner;
import java.util.Arrays;

public class GradesStatistics {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[] grades = new int[numStudents];

        for(int i=0; i<numStudents; i++) {
            System.out.print("Enter the grade for student " + (i+1) + ": ");
            grades[i] = scanner.nextInt();
        }

        System.out.println("The grades are: " + Arrays.toString(grades));
        System.out.printf("The average is: %.2f\n", average(grades));
        System.out.printf("The median is: %.2f\n", median(grades));
        System.out.println("The minimum is: " + min(grades));
        System.out.println("The maximum is: " + max(grades));
        System.out.printf("The standard deviation is: %.2f\n", stdDev(grades));

    }

    public static double average(int[] array) {
        int sum = 0;
        for(int grade : array) {
            sum += grade;
        }
        return (double)sum / array.length;
    }

    public static double median(int[] array) {
        Arrays.sort(array);
        int mid = array.length / 2;
        if(array.length % 2 == 0) {
            return (double)(array[mid] + array[mid-1]) / 2;
        }
        else {
            return array[mid];
        }
    }

    public static int max(int[] array) {
        int max = array[0];
        for(int i=1; i<array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int min(int[] array) {
        int min = array[0];
        for(int i=1; i<array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static double stdDev(int[] array) {
        double mean = average(array);
        double sum = 0;
        for(int grade : array) {
            sum += Math.pow(grade - mean, 2);
        }
        return Math.sqrt(sum / array.length);
    }

}
