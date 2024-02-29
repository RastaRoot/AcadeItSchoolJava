package ClassAssignments;

public class Lecture5_1 {


    public static double getAverage(int startNumber, int endNumber) {
        int sum = 0;

        for (int i = startNumber; i <= endNumber; i++) {
            sum += i;
        }

        return (double) sum / (endNumber - startNumber + 1);
    }

    public static void main(String[] args) {
        int startNumber = 3;
        int endNumber = 33;

        int sum = 0;

        for (int i = startNumber; i <= endNumber; i++) {
            sum += i;
        }

        double average = (double) sum / (endNumber - startNumber + 1);
        System.out.println("Среднее арифметическое " + average);

        double average1 = getAverage(5, 19);
        System.out.println("Среднее " + average1);
    }

}