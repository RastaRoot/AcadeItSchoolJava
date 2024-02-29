package Lesson4;

public class ArithmeticMeanDoWhile {
    public static void main(String[] args) {
        int i = 3;
        int lastNumber = 17;

        int count = 0;
        int sum = 0;

        int evenNumbersCount = 0;
        int evenNumbersSum = 0;

        do {
            if (i % 2 == 0) {
                evenNumbersSum += i;
                ++evenNumbersCount;
            }

            sum += i;
            ++count;
            ++i;
        } while (i <= lastNumber);

        double arithmeticMean = (double) sum / count;
        double evenNumbersArithmeticMean = (double) evenNumbersSum / evenNumbersCount;
        System.out.println("Среднее арифметическое = " + arithmeticMean);
        System.out.println("Среднее арифметическое четных чисел = " + evenNumbersArithmeticMean);
    }
}