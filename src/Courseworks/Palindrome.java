package Courseworks;

public class Palindrome {
    public static boolean isPalindrome(String line) {
        int left = 0;
        int right = line.length() - 1;

        while (left < right) {
            char leftChar = line.charAt(left);
            char rightChar = line.charAt(right);

            if (!Character.isLetter(leftChar)) {
                left++;
                continue;
            }

            if (!Character.isLetter(rightChar)) {
                right--;
                continue;
            }

            if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String line = "Аргентина манит негра";
        System.out.println(isPalindrome(line));
    }
}