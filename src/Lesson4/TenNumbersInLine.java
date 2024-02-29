package Lesson4;

public class TenNumbersInLine {
    public static void main(String[] args) {
        int i = 1;
        int lastNumber = 100;

        while (i <= lastNumber) {
            System.out.print(i + " ");

            if (i % 10 == 0) {
                System.out.println(i);
            }

            i++;
        }
    }
}