package lab2.Exercises4;

public class ArrayCopy {

    public static int[] copyOf(int[] array) {
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    public static int[] copyOf(int[] array, int newLength) {
        int[] copy = new int[newLength];
        int elementsToCopy = Math.min(array.length, newLength);
        for (int i = 0; i < elementsToCopy; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};

        int[] copy1 = copyOf(array);
        System.out.println(java.util.Arrays.toString(copy1));

        int[] copy2 = copyOf(array, 5);
        System.out.println(java.util.Arrays.toString(copy2));
    }

}
