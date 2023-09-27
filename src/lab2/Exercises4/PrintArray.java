package lab2.Exercises4;

public class PrintArray {

    public static void print(int[] array) {
        if (array.length == 0) {
            System.out.print("[]");
        } else {
            System.out.print("[" + array[0]);
            for (int i = 1; i < array.length; i++) {
                System.out.print(", " + array[i]);
            }
            System.out.print("]");
        }
    }

    public static void print(double[] array) {
        if (array.length == 0) {
            System.out.print("[]");
        } else {
            System.out.print("[" + array[0]);
            for (int i = 1; i < array.length; i++) {
                System.out.print(", " + array[i]);
            }
            System.out.print("]");
        }
    }

    public static void print(float[] array) {
        if (array.length == 0) {
            System.out.print("[]");
        } else {
            System.out.print("[" + array[0]);
            for (int i = 1; i < array.length; i++) {
                System.out.print(", " + array[i]);
            }
            System.out.print("]");
        }
    }

    public static void main(String[] args) {
        int[] intArray = {1, 2, 3};
        print(intArray);

        double[] doubleArray = {};
        print(doubleArray);

        float[] floatArray = {1.1f, 2.2f, 3.3f};
        print(floatArray);
    }

}
