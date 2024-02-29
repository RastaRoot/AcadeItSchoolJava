package Lesson6;

public class Overload {
    public static int getTypeSize(byte value) {
        return 1;
    }

    public static int getTypeSize(short value) {
        return 2;
    }

    public static int getTypeSize(int value) {
        return 4;
    }

    public static int getTypeSize(long value) {
        return 8;
    }

    public static int getTypeSize(float value) {
        return 4;
    }

    public static int getTypeSize(double value) {
        return 8;
    }

    public static void main(String[] args) {
        byte byteExample = 1;
        short shortExample = 1;
        int intExample = 1;
        long longExample = 1L;
        float floatExample = 1.0f;
        double doubleExample = 1.0;

        System.out.println("Количество байт, требуемых под переменную byte - " + getTypeSize(byteExample));
        System.out.println("Количество байт, требуемых под переменную short - " + getTypeSize(shortExample));
        System.out.println("Количество байт, требуемых под переменную int - " + getTypeSize(intExample));
        System.out.println("Количество байт, требуемых под переменную long - " + getTypeSize(longExample));
        System.out.println("Количество байт, требуемых под переменную float - " + getTypeSize(floatExample));
        System.out.println("Количество байт, требуемых под переменную double - " + getTypeSize(doubleExample));
    }
}