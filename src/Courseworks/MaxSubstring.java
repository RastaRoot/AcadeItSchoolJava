package Courseworks;

public class MaxSubstring {
    public static int getMaxSubstringLength(String line) {
        int maxSubstringLength = 0;
        int substringLength = 1;

        String convertLineToUpperCase = line.toUpperCase();

        for (int i = 1; i < convertLineToUpperCase.length(); ++i) {
            if (convertLineToUpperCase.charAt(i) == convertLineToUpperCase.charAt(i - 1)) {
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
        System.out.println(getMaxSubstringLength("hghghghytytytRRrrrrrRlkhhjh"));
    }
}