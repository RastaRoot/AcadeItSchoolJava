package Lesson3;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        String correctPassword = "qwerty";
        int correctPasswordLength = correctPassword.length();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите пароль:");
        String enteredPassword = scanner.nextLine();

        int enteredPasswordLength = enteredPassword.length();

        if (correctPassword.equals(enteredPassword)) {
            System.out.println("Пароль верный");
        } else if (enteredPasswordLength > correctPasswordLength) {
            System.out.println("Пароль неверный, строка слишком длинная");
        } else if (enteredPasswordLength < correctPasswordLength) {
            System.out.println("Пароль неверный, строка слишком короткая");
        } else {
            System.out.println("Пароль неверный");
        }
    }
}