package lab2.Exercises4;

public class ArraySwap {

    public static boolean swap(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            int temp = array1[i];
            array1[i] = array2[i];
            array2[i] = temp;
        }

        return true;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        swap(array1, array2);

        System.out.println(java.util.Arrays.toString(array1));
        System.out.println(java.util.Arrays.toString(array2));
    }

}
