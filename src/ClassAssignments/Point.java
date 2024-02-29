package ClassAssignments;

import java.util.Scanner;


public class Point {

    public static int printAndRead(String string) {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
    public static void main(String[] args) {
        int a = printAndRead("Введите число:");
        System.out.println(a);
    }
}