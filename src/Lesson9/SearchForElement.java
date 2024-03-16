package Lesson9;

public class SearchForElement {
    public static int getElementIndex(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = {9, 8, 7, 6, 5};
        System.out.println(getElementIndex(array, 7));
    }
}