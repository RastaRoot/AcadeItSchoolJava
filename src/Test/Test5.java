package Test;

public class Test5 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        while (i <= 9) {
            sum += i;
            ++i;
        }
        System.out.println("Сумма = " + sum);

        int j = 3;
        int sum2 = 0;
        while (j <= 21) {
            sum2 += j;
            ++j;
        }
        System.out.println("Сумма = " + sum2);

        int k = 3;
        int sum3 = 0;
        while (k <= 21) {
            if (k % 2 == 0) {

                sum3 += k;
            }
            ++k;
        }
        System.out.println("Сумма = " + sum3);

        int m = 3;
        int count = 0;
        int sum4 = 0;
        while (m <= 21) {
            if (m % 2 == 0) {

                sum4 += m;
            }
            ++m;
            ++count;
        }
        System.out.println("Сумма = " + sum3);
        System.out.println("Сумма = " + count);
    }
}




