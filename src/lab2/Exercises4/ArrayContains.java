package lab2.Exercises4;

public class ArrayContains {

    public static boolean contains(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};

        System.out.println(contains(array, 2)); // true
        System.out.println(contains(array, 5)); // false

        int[] empty = {};
        System.out.println(contains(empty, 1)); // false
    }

}
