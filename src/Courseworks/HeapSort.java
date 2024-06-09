package Courseworks;

import java.util.Arrays;

public class HeapSort {
    public static void heapSort(int[] array) {
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            siftElement(array, array.length, i);
        }

        for (int i = array.length - 1; i > 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            siftElement(array, i, 0);
        }
    }

    public static void siftElement(int[] array, int heapSize, int i) {
        while (true) {
            int child1Index = 2 * i + 1;
            int child2Index = 2 * i + 2;
            int maxElementIndex = i;

            if (child1Index < heapSize && array[child1Index] > array[maxElementIndex]) {
                maxElementIndex = child1Index;
            }

            if (child2Index < heapSize && array[child2Index] > array[maxElementIndex]) {
                maxElementIndex = child2Index;
            }

            if (maxElementIndex == i) {
                return;
            }

            int temp = array[i];
            array[i] = array[maxElementIndex];
            array[maxElementIndex] = temp;

            i = maxElementIndex;
        }
    }

    public static void main(String[] args) {
        int[] array = {12, 5, 9, 4, 7, 1, 3, 6};
        heapSort(array);
        System.out.println(Arrays.toString(array));
    }
}