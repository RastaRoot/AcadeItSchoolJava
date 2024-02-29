package Test;

public class Test3 {
    public static void main(String[] args) {
        int x = 8 + ((5 - 3) / (4 - 2) * (16 / 4));
        int y = 17 - (6 + 42) / (2 * x);
        int z = (3 * x * y) / (2 * x - 12);
        System.out.println("Ответ: " + x);
        System.out.println("Ответ: " + y);
        System.out.println("Ответ: " + z);

        if (x < 15) {
            System.out.println("+");
        }

        if (y < 15) {
            System.out.println("+");
        } else {
            System.out.println("-");
        }


    }
}
