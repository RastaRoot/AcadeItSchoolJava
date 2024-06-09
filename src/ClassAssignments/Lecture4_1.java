package ClassAssignments;

public class Lecture4_1 {
    public static void main(String[] args) {
        int i = 3;
        int sum = 0;
        int count = 0;

        while (i <= 21) {
            if (i % 2 == 0) {
                count++;
                sum = sum + i;
            }
            i++;
        }
        System.out.println("Сумма = " + sum + " Количество =  " + count);
    }
}