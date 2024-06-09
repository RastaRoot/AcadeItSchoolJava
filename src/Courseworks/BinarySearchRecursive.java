package Courseworks;

public class BinarySearchRecursive {
    private static int binarySearchRecursive(int[] array, int x, int left, int right) {
        if (left > right) {
            return -1;
        }

        int middle = (left + right) / 2;

        if (array[middle] == x) {
            return middle;
        }

        if (array[middle] < x) {
            return binarySearchRecursive(array, x, middle + 1, right);
        }

        return binarySearchRecursive(array, x, left, middle - 1);
    }

    public static int binarySearchRecursive(int[] array, int x) {
        return binarySearchRecursive(array, x, 0, array.length - 1);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(binarySearchRecursive(array, 5));
    }
}