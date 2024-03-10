package Courseworks;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int hiddenNumber = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);
        int attemptsAmount = 0;

        while (true) {
            System.out.print("Введите число: ");
            int userNumber = scanner.nextInt();

            attemptsAmount++;

            if (hiddenNumber > userNumber) {
                System.out.print("Загаданное число больше введенного, попробуйте еще раз");
            } else if (hiddenNumber < userNumber) {
                System.out.println("Загаданное число меньше введенного, попробуйте еще раз");
            } else {
                System.out.println("Вы угадали за " + attemptsAmount + " попыток!");
                break;
            }
        }
    }
}