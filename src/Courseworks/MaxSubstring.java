package Courseworks;

public class MaxSubstring {
    public static int getMaxSubstringLength(String line) {
        int maxSubstringLength = 0;
        int substringLength = 1;
        String caseEdit = line.toUpperCase();

        for (int i = 1; i < caseEdit.length(); ++i) {

            if (caseEdit.charAt(i) == caseEdit.charAt(i - 1)) {
                ++substringLength;

                if (substringLength > maxSubstringLength) {
                    maxSubstringLength = substringLength;
                }
            } else {
                substringLength = 1;
            }
        }

        return maxSubstringLength;
    }
    public static void main(String[] args) {
        int symbolsCount = getMaxSubstringLength("hghghghytytytRRrrrrrRlkhhjh");
        System.out.println(symbolsCount);

    }
}