package Lesson6;

public class Overload {
    public static int getTypeSize(byte number) {
        return 1;
    }

    public static int getTypeSize(short number) {
        return 2;
    }

    public static int getTypeSize(int number) {
        return 4;
    }

    public static int getTypeSize(long number) {
        return 8;
    }

    public static int getTypeSize(float number) {
        return 4;
    }

    public static int getTypeSize(double number) {
        return 8;
    }

    public static void main(String[] args) {
        byte byteNumber = 1;
        short shortNumber = 1;
        int intNumber = 1;
        long longNumber = 1L;
        float floatNumber = 1.0f;
        double doubleNumber = 1.0;

        System.out.println("Количество байт, требуемых под переменную byte - " + getTypeSize(byteNumber));
        System.out.println("Количество байт, требуемых под переменную short - " + getTypeSize(shortNumber));
        System.out.println("Количество байт, требуемых под переменную int - " + getTypeSize(intNumber));
        System.out.println("Количество байт, требуемых под переменную long - " + getTypeSize(longNumber));
        System.out.println("Количество байт, требуемых под переменную float - " + getTypeSize(floatNumber));
        System.out.println("Количество байт, требуемых под переменную double - " + getTypeSize(doubleNumber));
    }
}