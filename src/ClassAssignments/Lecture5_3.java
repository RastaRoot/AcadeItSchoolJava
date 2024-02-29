package ClassAssignments;

public class Lecture5_3 {
    public static double getAverage(int begin, int end) {
        int sum = 0;

        for (int i = begin; i <= end; i++) {
            sum += i;
        }
        return (double) sum / (end - begin + 1);
    }

    public static void main(String[] args) {
        System.out.println(getAverage(11, 33));
    }
}