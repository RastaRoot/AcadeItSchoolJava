package Courseworks;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите свой возраст от 1 до 112 лет включительно:");
        int age = scanner.nextInt();

        if (age < 1) {
            System.out.println("Вы слишком малы");
        } else if (age > 112) {
            System.out.println("Вы слишком стары");
        } else {
            int lastDigit = age % 10;
            int lastTwoDigits = age % 100;

            if (lastTwoDigits >= 11 && lastTwoDigits <= 14) {
                System.out.println("Вам " + age + " лет");
            } else if (lastDigit == 1) {
                System.out.println("Вам " + age + " год");
            } else if (lastDigit >= 2 && lastDigit <= 4) {
                System.out.println("Вам " + age + " года");
            } else {
                System.out.println("Вам " + age + " лет");
            }
        }
    }
}