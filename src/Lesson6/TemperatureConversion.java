package Lesson6;

import java.util.Scanner;

public class TemperatureConversion {
    public static double getKelvin(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }

    public static double getFahrenheit(double celsiusTemperature) {
        return celsiusTemperature * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите температуру в градусах Цельсия: ");
        double celsiusTemperature = scanner.nextDouble();

        double kelvinTemperature = getKelvin(celsiusTemperature);
        System.out.println(celsiusTemperature + " °C = " + kelvinTemperature + " K");

        double fahrenheitTemperature = getFahrenheit(celsiusTemperature);
        System.out.println(celsiusTemperature + " °C = " + fahrenheitTemperature + " ℉");
    }
}