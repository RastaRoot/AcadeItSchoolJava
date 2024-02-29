package Test;

public class Test {
    public static void main(String[] args) {
        double a = 4;
        double b = 21;
        double c = 5;

        double d = b * b - 4 * a * c;
        if (d < 0) {
            System.out.println("Корней нет");
        } else if (d == 0) {
            double x1 = (-b / 2 * a);
            System.out.println("Один корень, x = " + x1);
        } else if (d > 0) {
            double x2 = (-b + Math.sqrt(d)) / (2 * a);
            double x3 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Два корня, x1 = " + x2 + " x2 = " + x3);

        }
    }
}