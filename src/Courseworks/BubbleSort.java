package Courseworks;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean isSorted = true;

            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] < array[j]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;

                    isSorted = false;
                }
            }

            if (isSorted) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {6, 5, 7, 3, 9};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}