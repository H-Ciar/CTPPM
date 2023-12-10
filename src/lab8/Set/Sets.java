package lab8.Set;

import java.util.*;

public class Sets {
    /**
     * Function returning the intersection of two given sets without using library functions
     */
    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> result = new HashSet<>();
        for (Integer element : first) {
            if (second.contains(element)) {
                result.add(element);
            }
        }
        return result;
    }

    /**
     * Function returning the union of two given sets without using library functions
     */
    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> result = new HashSet<>(first);
        result.addAll(second);
        return result;
    }

    /**
     * Function returning the intersection of two given sets using retainAll()
     */
    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        Set<Integer> result = new HashSet<>(first);
        result.retainAll(second);
        return result;
    }

    /**
     * Function returning the union of two given sets using addAll()
     */
    public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        Set<Integer> result = new HashSet<>(first);
        result.addAll(second);
        return result;
    }

    /**
     * Function to transform a set into a list without duplicates
     */
    public static List<Integer> toList(Set<Integer> source) {
        List<Integer> list = new ArrayList<>(source);
        return list;
    }

    /**
     * Function to remove duplicates from a list
     */
    public static List<Integer> removeDuplicates(List<Integer> source) {
        Set<Integer> set = new LinkedHashSet<>(source);
        return new ArrayList<>(set);
    }

    /**
     * Function to remove duplicates from a list without using constructor tricks
     */
    public static List<Integer> removeDuplicatesManual(List<Integer> source) {
        List<Integer> result = new ArrayList<>();
        for (Integer element : source) {
            if (!result.contains(element)) {
                result.add(element);
            }
        }
        return result;
    }

    /**
     * Function accepting a string and returning the first recurring character
     */
    public static String firstRecurringCharacter(String s) {
        Set<Character> charSet = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (charSet.contains(c)) {
                return String.valueOf(c);
            }
            charSet.add(c);
        }
        return null; // If no recurring character is found
    }

    /**
     * Function accepting a string and returning a set comprising all recurring characters
     */
    public static Set<Character> allRecurringChars(String s) {
        Set<Character> recurringChars = new HashSet<>();
        Set<Character> uniqueChars = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (uniqueChars.contains(c)) {
                recurringChars.add(c);
            }
            uniqueChars.add(c);
        }
        return recurringChars;
    }

    /**
     * Function to transform a set into an array
     */
    public static Integer[] toArray(Set<Integer> source) {
        return source.toArray(new Integer[0]);
    }

    /**
     * Function to return the first item from a TreeSet
     */
    public static int getFirst(TreeSet<Integer> source) {
        if (!source.isEmpty()) {
            return source.first();
        }
        return -1; // Return -1 if the set is empty
    }

    /**
     * Function to return the last item from a TreeSet
     */
    public static int getLast(TreeSet<Integer> source) {
        if (!source.isEmpty()) {
            return source.last();
        }
        return -1; // Return -1 if the set is empty
    }

    /**
     * Function to get an element from a TreeSet that is strictly greater than a given value
     */
    public static int getGreater(TreeSet<Integer> source, int value) {
        Integer greater = source.higher(value);
        if (greater != null) {
            return greater;
        }
        return -1; // Return -1 if no greater element is found
    }
}

