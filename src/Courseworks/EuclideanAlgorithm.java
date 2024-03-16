package Courseworks;

import java.util.Scanner;

public class EuclideanAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int number1 = scanner.nextInt();

        System.out.println("Введите второе число:");
        int number2 = scanner.nextInt();

        if (number1 == 0 && number2 == 0) {
            System.out.println("Решений нет");
        } else {
            while (number2 != 0) {
                int temp = number2;
                number2 = number1 % number2;
                number1 = temp;
            }

            int greatestCommonDivider = number1;
            System.out.println("Наибольший общий делитель = " + greatestCommonDivider);
        }
    }
}