package Lesson6;

import java.util.Scanner;

public class PrintAndRead {
    public static int printAndRead(String inputPrompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(inputPrompt);

        return scanner.nextInt();
    }

    public static void main(String[] args) {
        int a = printAndRead("Введите число:");
        System.out.println(a);

        int b = printAndRead("Введите другое число:");
        System.out.println(b);
    }
}