package Lesson9;

public class ReverseArray {
    public static void reverseArray(int[] array) {
        int arrayHalfLength = array.length / 2;

        for (int i = 0; i < arrayHalfLength; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        reverseArray(array);

        for (int number : array) {
            System.out.print(number + " ");
        }
    }
}