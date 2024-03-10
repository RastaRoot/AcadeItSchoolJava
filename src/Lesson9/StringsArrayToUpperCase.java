package Lesson9;

public class StringsArrayToUpperCase {
    public static void convertToUpperCase(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].toUpperCase();
        }
    }

    public static void main(String[] args) {
        String[] array = {"hello, ", "I'm Johnthreevolt"};
        convertToUpperCase(array);

        for (String string : array) {
            System.out.print(string + " ");
        }
    }
}