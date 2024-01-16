package src.logestpalindromesubstring;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        String s = "babad";
        System.out.println(Solution.longestPalindrome(s));

    }

    public static class Solution {
        public static String longestPalindrome(String s){

            if(s == null || s.length()<=0) return "";
            String res = "";
            for (int i = 0; i < s.length(); i++) {
                // we'll check for both even and odd string length cases
                String oddLength = checkLongestPalindromeLengthFromThisCenter(i, i, s, res.length());
                String evenLength = checkLongestPalindromeLengthFromThisCenter(i, i + 1, s, res.length());
                String receivingString = (oddLength.length() > evenLength.length()) ? oddLength : evenLength;
                if (receivingString.length() > res.length()) {
                    res = receivingString;
                }
            }
            return res;
        }

        public static String checkLongestPalindromeLengthFromThisCenter(int left, int right, String s, int currentMax) {
            String tempRes = "";
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)
            ) {
                if ((right - left + 1) > currentMax) {
                    tempRes = s.substring(left, right + 1);
                }
                left--;
                right++;
            }
            return tempRes;
        }
    }
}


