package Lesson2;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину: ");
        double length = scanner.nextDouble();

        System.out.print("Введите ширину: ");
        double width = scanner.nextDouble();

        double area = length * width;
        double perimeter = 2 * (length + width);
        System.out.printf("Длина = %.2f, Ширина = %.2f, Площадь = %.2f, Периметр = %.2f", length, width, area, perimeter);
    }
}
