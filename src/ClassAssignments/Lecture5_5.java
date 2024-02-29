package ClassAssignments;

public class Lecture5_5 {
    public static int getMin(int a, int b) {
        int min;

        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(getMin(34, 12));
    }
}