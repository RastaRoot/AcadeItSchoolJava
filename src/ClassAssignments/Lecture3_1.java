package ClassAssignments;

import java.util.Scanner;

public class Lecture3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Данное число положительное");
        } else if (number == 0) {
            System.out.println(0);
        } else {
            System.out.println("Число отрицательное");
        }
    }
}