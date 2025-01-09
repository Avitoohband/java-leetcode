package src.easy.ispalindrome;

public class IsPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";

        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        if (s == null || s.length() <= 0) return true;

        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            while (start < end && !Character.isLetterOrDigit(s.charAt(start))) start++;
            while (start < end && !Character.isLetterOrDigit(s.charAt(end))) end--;
            if (Character.toLowerCase(s.charAt(start))
                    != Character.toLowerCase(s.charAt(end))) return false;
            start++;
            end--;
        }
        return true;
    }
}