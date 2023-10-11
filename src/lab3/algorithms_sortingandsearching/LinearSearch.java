package lab3.algorithms_sortingandsearching;

public class LinearSearch {

    public static void main(String[] args) {
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 5;
        }

        System.out.println(linearSearch(array, 10));
        System.out.println(linearSearchingIndex(array, 3));

    }

    public static boolean linearSearch(int[] array, int key) {
        if (array == null) {
            return false;
        }

        for (int i = 0; i < array.length; i++) {
            if (key == array[i]) {
                return true;
            }
        }

        return false;
    }

    public static int linearSearchingIndex(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (key == array[i]) {
                return i + 1;
            }
        }

        return 0;
    }
}
