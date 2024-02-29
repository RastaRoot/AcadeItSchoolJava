package Lesson4;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите команду:");
        int command = scanner.nextInt();

        System.out.println("Введите первое число:");
        double number1 = scanner.nextDouble();

        System.out.println("Введите второе число:");
        double number2 = scanner.nextDouble();

        switch (command) {
            case 1:
                double sum = number1 + number2;
                System.out.println("Результат сложения = " + sum);
                break;
            case 2:
                double difference = number1 - number2;
                System.out.println("Результат вычитания = " + difference);
                break;
            case 3:
                double product = number1 * number2;
                System.out.println("Результат умножения = " + product);
                break;
            case 4:
                double quotient = number1 / number2;
                System.out.println("Результат деления = " + quotient);
                break;
            default:
                System.out.println("Неизвестная операция");
                break;
        }
    }
}
