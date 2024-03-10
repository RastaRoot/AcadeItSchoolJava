package Lesson9;

public class ReverseArray {
    public static void toReverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        toReverseArray(array);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}