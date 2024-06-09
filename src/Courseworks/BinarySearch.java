package Courseworks;

public class BinarySearch {
    public static int binarySearch(int[] array, int x) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (array[middle] < x) {
                left = middle + 1;
            } else if (array[middle] > x) {
                right = middle - 1;
            } else {
                return middle;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(binarySearch(array, 6));
    }
}