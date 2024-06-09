package Courseworks;

import java.util.Arrays;

public class QuickSort2 {
    public static void quickSort2(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }

        int i = left;
        int j = right;
        int pivot = array[(left + right) / 2];

        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }

            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;

                i++;
                j--;
            }
        }

        if (left < j) {
            quickSort2(array, left, j);
        }

        if (right > i) {
            quickSort2(array, i, right);
        }
    }

    public static void main(String[] args) {
        int[] array = {3, 7, 9, 2, 9, 4, 5};
        quickSort2(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }
}