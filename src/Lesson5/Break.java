package Lesson5;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String correctLine = "Heinsenberg";

        while (true) {
            System.out.println("Введите загаданную строку:");
            String userLine = scanner.nextLine();

            if (correctLine.equals(userLine)) {
                System.out.println("Введена правильная загаданная строка!");
                break;
            }

            System.out.println("Введена неверная строка");
        }
    }
}