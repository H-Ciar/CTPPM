package lab3.algorithms_sortingandsearching;

public class BinarySearch {
    public static void main(String[] args) {
        BinarySearch ob = new BinarySearch();
        int arr[] = { 2, 3, 4, 10, 40 };
        int x = 5;
        System.out.println(ob.binarySearch(arr, x));
    }

    // Return true if key is found in the array in the range of fromIdx to tolIdx
    public boolean binarySearch(int[] array, int key, int fromIdx, int toIdx) {

        if (fromIdx == toIdx - 1) {
            if (array[fromIdx] == key) {
                return true;
            } else {
                return false;
            }
        } else {
            int mideleIdx = (fromIdx + toIdx)/ 2;
            if (key == array[mideleIdx]) {
                return true;
            } else if (key < array[mideleIdx]) {
                toIdx = mideleIdx;
            } else {
                fromIdx = mideleIdx + 1;
            }
        }

        return binarySearch(array, key, fromIdx, toIdx);
    }

    // Return true if key is found in the array
    public boolean binarySearch(int[] array, int key) {
        boolean result = binarySearch(array, key, 0, array.length - 1);

        return result;
    }
}
