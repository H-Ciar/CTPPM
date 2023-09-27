package lab2.Exercises4;

public class ArraySearch {

    public static int search(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};

        System.out.println(search(array, 2)); // 1
        System.out.println(search(array, 5)); // -1

        int[] empty = {};
        System.out.println(search(empty, 1)); // -1
    }

}
