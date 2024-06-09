package Courseworks;

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }

        int delimiter = array[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (array[j] <= delimiter) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[right];
        array[right] = temp;

        quickSort(array, left, i);
        quickSort(array, i + 2, right);

    }

    public static void main(String[] args) {
        int[] array = {3, 7, 9, 2, 9, 4, 5};
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }
}