package Lesson8;

import java.util.Scanner;

public class CharactersCounting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String userLine = scanner.nextLine();

        int lettersAmount = 0;
        int digitsAmount = 0;
        int whiteSpacesAmount = 0;
        int otherSymbolsAmount = 0;

        for (int i = 0; i < userLine.length(); ++i) {
            char symbol = userLine.charAt(i);

            if (Character.isLetter(symbol)) {
                ++lettersAmount;
            } else if (Character.isDigit(symbol)) {
                ++digitsAmount;
            } else if (Character.isWhitespace(symbol)) {
                ++whiteSpacesAmount;
            } else {
                ++otherSymbolsAmount;
            }
        }

        System.out.println("В этой строке " + lettersAmount + " букв, "
                + digitsAmount + " цифр, " + whiteSpacesAmount + " пробелов, " + otherSymbolsAmount + " остальных символов");
    }
}