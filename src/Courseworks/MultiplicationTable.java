package Courseworks;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите последнее число таблицы умножения: ");
        int lastNumber = scanner.nextInt();

        System.out.print("     |");

        for (int i = 1; i <= lastNumber; i++) {
            System.out.printf("%4d ", i);
        }

        System.out.println();
        System.out.print("-----|");

        String indentLine = "-----".repeat(lastNumber);
        System.out.println(indentLine);

        for (int i = 1; i <= lastNumber; i++) {
            System.out.printf("%4d |", i);

            for (int j = 1; j <= lastNumber; j++) {
                System.out.printf("%4d ", i * j);
            }

            System.out.println();
        }
    }
}