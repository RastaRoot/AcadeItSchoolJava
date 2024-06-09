package Courseworks;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j;

            for (j = i - 1; j >= 0; j--) {
                if (array[j] <= temp) {
                    break;
                }

                array[j + 1] = array[j];
            }

            array[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {8, 5, 9, 1, 9};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
}