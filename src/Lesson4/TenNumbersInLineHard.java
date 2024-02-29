package Lesson4;

import java.util.Scanner;

public class TenNumbersInLineHard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите начальное число: ");
        int startNumber = scanner.nextInt();

        System.out.print("Введите конечное число: ");
        int lastNumber = scanner.nextInt();

        System.out.print("Введите количество чисел в строке: ");
        int numbersCountInLine = scanner.nextInt();

        int i = startNumber;
        int numbersCount = 0;

        while (i <= lastNumber) {
            System.out.printf("%5d", i);
            numbersCount++;

            if (numbersCount == numbersCountInLine) {
                System.out.println();
                numbersCount = 0;
            }

            i++;
        }
    }
}