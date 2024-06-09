package Lesson10;

public class Exponentiation {
    public static int raiseToPowerNotRecursive(int number, int power) {
        int result = 1;

        for (int i = 1; i <= power; i++) {
            result *= number;
        }

        return result;
    }

    public static int raiseToPowerRecursive(int number, int power) {
        if (power == 0) {
            return 1;
        }

        return number * raiseToPowerRecursive(number, power - 1);
    }

    public static void main(String[] args) {
        int number = 5;
        int power = 4;

        System.out.println(number + " в степени " + power + " = " + raiseToPowerNotRecursive(number, power));
        System.out.println(number + " в степени " + power + " = " + raiseToPowerRecursive(number, power));
    }
}