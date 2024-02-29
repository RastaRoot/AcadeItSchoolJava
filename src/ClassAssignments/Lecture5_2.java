package ClassAssignments;

public class Lecture5_2 {
    public static double getExpression(double x, double y) {
        return 3 * x + 4 * y;
    }

    public static void main(String[] args) {
        System.out.println(getExpression(5, 8));

        double b = getExpression(11, 12);
        System.out.println(b);
    }

}