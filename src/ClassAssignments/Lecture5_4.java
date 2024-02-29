package ClassAssignments;

public class Lecture5_4 {
    public static int getMax(int a, int b) {
        int max;
        if (a > b) {
            max = a;

        } else {
            max = b;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(getMax(7, 10));
    }
}
