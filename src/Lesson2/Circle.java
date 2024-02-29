package Lesson2;

public class Circle {
    public static void main(String[] args) {
        double radius = 16;
        double area = Math.PI * Math.pow(radius, 2);
        double length = 2 * Math.PI * radius;
        System.out.println("1. Площадь круга = " + area + ", Длина окружности = " + length);

        double givenArea = 61;
        double calculatedRadius = Math.sqrt(givenArea / Math.PI);
        System.out.println(System.lineSeparator() + "2. Радиус окружности = " + calculatedRadius);

        double givenRadius = 15;
        double givenAngle = 20;
        double sectorArea = (Math.PI * Math.pow(givenRadius, 2) * givenAngle) / 360;
        System.out.println(System.lineSeparator() + "3. Площадь сектора = " + sectorArea);
    }
}
