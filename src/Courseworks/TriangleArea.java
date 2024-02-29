package Courseworks;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите координаты точки точки №1 на оси х:");
        double point1X = scanner.nextDouble();

        System.out.println("Введите координаты точки точки №1 на оси y:");
        double point1Y = scanner.nextDouble();

        System.out.println("Введите координаты точки точки №2 на оси x:");
        double point2X = scanner.nextDouble();

        System.out.println("Введите координаты точки точки №2 на оси y:");
        double point2Y = scanner.nextDouble();

        System.out.println("Введите координаты точки точки №3 на оси х:");
        double point3X = scanner.nextDouble();

        System.out.println("Введите координаты точки точки №3 на оси y:");
        double point3Y = scanner.nextDouble();

        double pointsOnOneLine = (point1X - point3X) * (point2Y - point3Y) - (point2X - point3X)
                * (point1Y - point3Y);
        final double epsilon = 1.0e-10;

        if (Math.abs(pointsOnOneLine) < epsilon) {
            System.out.println("Введенные точки лежат на одной прямой");
        } else {
            double sideALength = Math.sqrt(Math.pow(point2X - point1X, 2) + Math.pow(point2Y - point1Y, 2));
            double sideBLength = Math.sqrt(Math.pow(point3X - point2X, 2) + Math.pow(point3Y - point2Y, 2));
            double sideCLength = Math.sqrt(Math.pow(point1X - point3X, 2) + Math.pow(point1Y - point3Y, 2));

            double triangleSemiPerimeter = (sideALength + sideBLength + sideCLength) / 2;

            double triangleArea = Math.sqrt(triangleSemiPerimeter * (triangleSemiPerimeter - sideALength) *
                    (triangleSemiPerimeter - sideBLength) * (triangleSemiPerimeter - sideCLength));

            System.out.println("Площадь треугольника = " + triangleArea);
        }
    }
}