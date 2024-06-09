package ClassAssignments;

public class Lecture12_1 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i <= 100; i++) {
            stringBuilder.append(i).append(", ");
        }

        stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length() - 1);

        String string = stringBuilder.toString();
        System.out.println(string);
    }
}