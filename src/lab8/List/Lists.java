package lab8.List;
import java.util.*;

public class Lists {
    /**
     * Function to insert an element into a list at the beginning
     */
    public static void insertFirst(List<Integer> list, int value) {
        list.add(0, value);
    }

    /**
     * Function to insert an element into a list at the end
     */
    public static void insertLast(List<Integer> list, int value) {
        list.add(value);
    }

    /**
     * Function to replace the 3rd element of a list with a given value
     */
    public static void replace(List<Integer> list, int value) {
        if (list.size() >= 3) {
            list.set(2, value);
        }
    }

    /**
     * Function to remove the 3rd element from a list
     */
    public static void removeThird(List<Integer> list) {
        if (list.size() >= 3) {
            list.remove(2);
        }
    }

    /**
     * Function to remove the element "666" from a list
     */
    public static void removeEvil(List<Integer> list) {
        list.removeIf(item -> item == 666);
    }

    /**
     * Function returning a List<Integer> containing the first 10 square numbers (i.e., 1, 4, 9, 16, ...)
     */
    public static List<Integer> generateSquare() {
        List<Integer> squareList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            squareList.add(i * i);
        }
        return squareList;
    }
}
