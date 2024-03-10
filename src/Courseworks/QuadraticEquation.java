package Courseworks;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите коэффициент a:");
        double a = scanner.nextDouble();

        System.out.println("Введите коэффициент b:");
        double b = scanner.nextDouble();

        System.out.println("Введите коэффициент c:");
        double c = scanner.nextDouble();

        final double epsilon = 1.0e-10;

        if (Math.abs(a) >= epsilon) {
            double discriminant = b * b - 4 * a * c;

            if (Math.abs(discriminant) < epsilon) {
                double x = -b / (2 * a);
                System.out.println("Один корень, x = " + x);
            } else if (discriminant >= epsilon) {
                double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("Два корня, x1 = " + x1 + " x2 = " + x2);
            } else {
                System.out.println("Корней нет");
            }
        } else if (Math.abs(b) >= epsilon) {
            double x = -c / b;
            System.out.println("Уравнение линейное. Один корень: x = " + x);
        } else if (Math.abs(c) >= epsilon) {
            System.out.println("Уравнение не имеет решений");
        } else {
            System.out.println("Уравнение имеет бесконечное множество решений");
        }
    }
}