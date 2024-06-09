package Lesson9;

public class MultiplicationTableArray {
    public static int[][] getMultiplicationTable(int size) {
        int[][] multiplicationTable = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }

        return multiplicationTable;
    }

    public static void main(String[] args) {
        int size = 9;
        int[][] multiplicationTable = getMultiplicationTable(size);

        for (int[] row : multiplicationTable) {
            for (int e : row) {
                System.out.printf("%4d", e);
            }

            System.out.println();
        }
    }
}