package Courseworks;

public class MaxSubstring {
    public static int getMaxSubstringLength(String line) {
        if (line.isEmpty()) {
            return 0;
        }

        int maxSubstringLength = 0;
        int substringLength = 1;

        String lineInUpperCase = line.toUpperCase();

        for (int i = 1; i < lineInUpperCase.length(); ++i) {
            if (lineInUpperCase.charAt(i) == lineInUpperCase.charAt(i - 1)) {
                ++substringLength;

                if (substringLength > maxSubstringLength) {
                    maxSubstringLength = substringLength;
                }
            } else {
                substringLength = 1;
            }
        }

        if (substringLength > maxSubstringLength) {
            maxSubstringLength = substringLength;
        }

        return maxSubstringLength;
    }

    public static void main(String[] args) {
        System.out.println(getMaxSubstringLength("jhjhjhuuuuuuuyvghfhf"));
    }
}