package Lesson9;

public class SortingCheck {
    public static boolean isArraySortedAscending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static boolean isArraySortedDescending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        if (isArraySortedAscending(array)) {
            System.out.println("Массив отсортирован по возрастанию");
        } else if (isArraySortedDescending(array)) {
            System.out.println("Массив отсортирован по убыванию");
        } else {
            System.out.println("Массив не отсортирован");
        }
    }
}