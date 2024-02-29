package Lesson3;

import java.util.Scanner;

public class MaxMinElseIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое целое число: ");
        int number1 = scanner.nextInt();

        System.out.print("Введите второе целое число: ");
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.println("Наименьшее число - " + number2 + ", Наибольшее число - " + number1);
        } else {
            System.out.println("Наименьшее число - " + number1 + ", Наибольшее число - " + number2);
        }
    }
}
