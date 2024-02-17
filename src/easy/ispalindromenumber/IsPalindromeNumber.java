package src.easy.ispalindromenumber;

public class IsPalindromeNumber {
    public static void main(String[] args) {

    }

    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        int revNum = 0;
        int originalNum = x;
        while (x > 0) {
            revNum = (revNum * 10) + (x % 10);
            x = x / 10;
        }
        return revNum == originalNum;
    }
}
