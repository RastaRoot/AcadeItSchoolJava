package Courseworks;

import java.util.Scanner;

public class NextDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите день:");
        int day = scanner.nextInt();

        System.out.println("Введите месяц:");
        int month = scanner.nextInt();

        System.out.println("Введите год:");
        int year = scanner.nextInt();

        int daysAmountInMonth;

        if (month == 2) {
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                daysAmountInMonth = 29;
            } else {
                daysAmountInMonth = 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            daysAmountInMonth = 30;
        } else {
            daysAmountInMonth = 31;
        }

        if (year < 1 || month < 1 || month > 12 || day < 1 || day > daysAmountInMonth) {
            System.out.println("Введена некорректная дата");
        } else {
            if (day < daysAmountInMonth) {
                day++;
            } else {
                day = 1;

                if (month == 12) {
                    month = 1;
                    year++;
                } else {
                    month++;
                }
            }

            System.out.printf("Следующая дата: %02d.%02d.%04d", day, month, year);
        }
    }
}