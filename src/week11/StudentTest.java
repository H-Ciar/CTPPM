package week11;

import java.util.Scanner;

public class StudentTest {
    public static void inputStudents(Student[] studentArray, Scanner reader) {
        int n = studentArray.length;
        for (int i = 0; i < n; i++) {
            String hoten = reader.nextLine();
            int diem = reader.nextInt();

            studentArray[i] = new Student(hoten, diem);
        }
    }

    public static void printStudents(Student[] studentArray) {
        for (int i = 0; i < studentArray.length; i++) {
            studentArray[i].printStudent();
        }
    }

    public static void sortScores(Student[] arr) {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j].getDiem() < arr[min_idx].getDiem())
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            Student temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Student[] student = new Student[n];
        sc.nextLine();
        inputStudents(student, sc);
        sortScores(student);
        printStudents(student);
    }
}
