package Lesson9;

public class FindingMax {
    public static double getMax(double[] array) {
        double maxNumber = array[0];

        for (int i = 1; i < array.length; i++) {
            if (maxNumber < array[i]) {
                maxNumber = array[i];
            }
        }

        return maxNumber;
    }

    public static void main(String[] args) {
        double[] array = {1, 2, 3, 4, 5};
        System.out.println("Максимальное число - " + getMax(array));
    }
}