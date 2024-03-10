package Lesson9;

public class ArrayEvenNumbersArithmeticMean {
    public static double getEvenNumbersArithmeticMean(int[] array) {
        int sum = 0;
        int count = 0;

        for (int number : array) {
            if (number % 2 == 0) {
                count++;
                sum += number;
            }
        }

        return (double) sum / count;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Среднее арифметическое четных чисел = " + getEvenNumbersArithmeticMean(array));
    }
}