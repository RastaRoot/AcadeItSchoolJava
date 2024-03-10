package Courseworks;

public class Palindrome {
    public static boolean isPalindrome(String line) {
        int left = 0;
        int right = line.length() - 1;

        while (left < right) {
            if (Character.isLetter(line.charAt(left)) && Character.isLetter(line.charAt(right))) {
                if (Character.toLowerCase(line.charAt(left)) != Character.toLowerCase(line.charAt(right))) {
                    return false;
                }
                left++;
                right--;
            } else {
                if (!Character.isLetter(line.charAt(left))) {
                    left++;
                }
                if (!Character.isLetter(line.charAt(right))) {
                    right--;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "Аргентина манит негра";
        System.out.println(isPalindrome(str));
    }
}