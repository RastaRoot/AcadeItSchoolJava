package Lesson2;

public class ExpressionsEvaluation {
    public static void main(String[] args) {
        int x = 3 - (((56 - 12) / 44) * (4 / 2));
        double y = (2 * (double) x) / (33 - x);
        double z = -x / (2 * y);
        System.out.println("x = " + x + ", y = " + y + ", z = " + z);
    }
}