package lab2.Exercises4;

public class ArrayReverse {

    public static void reverse(int[] array) {
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};

        reverse(array);

        System.out.println(java.util.Arrays.toString(array));
    }

}
