package Test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите команду:");
        String command = scanner.nextLine();

        switch (command) {
            case "print":
                System.out.println("Введите строку:");
                String name2 = scanner.nextLine();

                System.out.println(name2);
                break;
            case "sum":

                System.out.println("Введите первое число:");
                double number1 = scanner.nextDouble();

                System.out.println("Введите второе число:");
                double number2 = scanner.nextDouble();

                System.out.println(number1 + number2);
                break;
            default:
                System.out.println("Неизвестная команда");
        }
    }
}
