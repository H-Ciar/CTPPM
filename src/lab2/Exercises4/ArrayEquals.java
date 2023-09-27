package lab2.Exercises4;

public class ArrayEquals {

    public static boolean equals(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        System.out.println(equals(array1, array2)); // true

        int[] array3 = {1, 2, 3};
        int[] array4 = {4, 5, 6};

        System.out.println(equals(array3, array4)); // false

        int[] empty1 = {};
        int[] empty2 = {};

        System.out.println(equals(empty1, empty2)); // true
    }

}
