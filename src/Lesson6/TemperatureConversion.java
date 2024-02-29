package Lesson6;

import java.util.Scanner;

public class TemperatureConversion {
    public static double getKelvin(double temperature) {
        return temperature + 273.15;
    }

    public static double getFahrenheit(double temperature) {
        return temperature * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите температуру в градусах Цельсия:");
        double celsiusTemperature = scanner.nextDouble();

        double kelvinsTemperature = getKelvin(celsiusTemperature);
        System.out.println(celsiusTemperature + " °C = " + kelvinsTemperature + " K");

        double fahrenheitsTemperature = getFahrenheit(celsiusTemperature);
        System.out.println(celsiusTemperature + " °C = " + fahrenheitsTemperature + " ℉");
    }
}