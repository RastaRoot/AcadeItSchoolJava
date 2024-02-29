package Courseworks;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номер числа Фибоначчи:");
        int fibonacciNumberIndex = scanner.nextInt();

        if (fibonacciNumberIndex == 0) {
            System.out.println("Число Фибоначчи с номером 0: 0");
            return;
        }

        if (fibonacciNumberIndex == 1) {
            System.out.println("Число Фибоначчи с номером 1: 1");
            return;
        }

        int previousFibonacciNumber = 1;
        int previousPreviousFibonacciNumber = 0;
        int fibonacciNumber = 0;

        for (int i = 2; i <= fibonacciNumberIndex; i++) {
            fibonacciNumber = previousFibonacciNumber + previousPreviousFibonacciNumber;
            previousPreviousFibonacciNumber = previousFibonacciNumber;
            previousFibonacciNumber = fibonacciNumber;
        }

        System.out.println("Число Фибоначчи с номером " + fibonacciNumberIndex + ": " + fibonacciNumber);
    }
}