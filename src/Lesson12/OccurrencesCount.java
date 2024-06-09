package Lesson12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OccurrencesCount {
    public static int getOccurrencesCount(File file, String searchString) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(file)) {
            searchString = searchString.toLowerCase();

            int occurrencesCount = 0;

            while (scanner.hasNextLine()) {
                String inputString = scanner.nextLine().toLowerCase();

                int searchStringStartIndex = 0;

                while (true) {
                    searchStringStartIndex = inputString.indexOf(searchString, searchStringStartIndex);

                    if (searchStringStartIndex < 0) {
                        break;
                    }

                    occurrencesCount++;

                    searchStringStartIndex += searchString.length();
                }
            }

            return occurrencesCount;
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.out.printf("Количество вхождений - %d", getOccurrencesCount(new File("input.txt"), ""));
    }
}