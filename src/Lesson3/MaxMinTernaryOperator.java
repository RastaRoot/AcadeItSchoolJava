package Lesson3;

import java.util.Scanner;

public class MaxMinTernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое целое число: ");
        int number1 = scanner.nextInt();

        System.out.print("Введите второе целое число: ");
        int number2 = scanner.nextInt();

        int max = (number1 > number2) ? number1 : number2;
        int min = (number1 < number2) ? number1 : number2;
        System.out.println("Наименьшее число - " + min + ", Наибольшее число - " + max);
    }
}
