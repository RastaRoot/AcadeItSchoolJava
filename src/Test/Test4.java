package Test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Данное число положительно");
        } else if (number == 0) {
            System.out.println("Данное число - 0");
        } else {
            System.out.println("Данное число - отрицательное");
        }
    }
}
