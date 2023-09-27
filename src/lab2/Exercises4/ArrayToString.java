package lab2.Exercises4;

public class ArrayToString {

    public static String arrayToString(int[] array) {
        if (array.length == 0) {
            return "[]";
        } else {
            String result = "[" + array[0];
            for (int i = 1; i < array.length; i++) {
                result += ", " + array[i];
            }
            result += "]";
            return result;
        }
    }

    public static void main(String[] args) {
        int[] empty = {};
        System.out.println(arrayToString(empty));

        int[] single = {1};
        System.out.println(arrayToString(single));

        int[] multi = {1, 2, 3};
        System.out.println(arrayToString(multi));
    }

}
