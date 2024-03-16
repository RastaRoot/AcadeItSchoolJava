package Courseworks;

import java.util.Scanner;

public class Contribution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сумму вклада:");
        double initialAmount = scanner.nextDouble();

        System.out.println("Введите годовую ставку:");
        double annualInterestRate = scanner.nextDouble();

        System.out.println("Введите срок в месяцах:");
        int monthsCount = scanner.nextInt();

        final double hundredPercent = 100;
        final double monthsInYearCount = 12;

        double monthlyInterestRate = annualInterestRate / monthsInYearCount / hundredPercent;
        double totalAmount = initialAmount;

        for (int i = 1; i <= monthsCount; i++) {
            totalAmount += totalAmount * monthlyInterestRate;
        }

        double profit = totalAmount - initialAmount;
        System.out.printf("Сумма вклада через %d месяцев: %.2f, прибыль: %.2f", monthsCount, totalAmount, profit);
    }
}