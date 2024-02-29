package Lesson4;

import java.util.Scanner;

public class NumbersSeriesSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество чисел:");
        int numbersCount = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= numbersCount; i++) {
            int numberSquare = i * i;

            if (i % 2 == 0) {
                numberSquare = -numberSquare;
            }

            sum += numberSquare;
        }

        System.out.println("Сумма ряда = " + sum);
    }
}
