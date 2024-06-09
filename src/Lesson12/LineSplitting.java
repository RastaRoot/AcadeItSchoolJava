package Lesson12;

public class LineSplitting {
    public static int getNumbersSum(String numbersLine) {
        String[] numberStringsArray = numbersLine.split(", ");

        int[] numbersArray = new int[numberStringsArray.length];

        int sum = 0;

        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = Integer.parseInt(numberStringsArray[i]);
            sum += numbersArray[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getNumbersSum("1, 2, 3, 4, 5"));
    }
}