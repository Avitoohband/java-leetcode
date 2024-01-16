package src.longestcommonsubsequence;

import java.util.Arrays;

public class LongestCommonSubsequence {

    public static void main(String[] args) {
        String text1 = "abcde";
        String text2 = "ace";
        System.out.println(longestCommonSubsequence(text1, text2));

    }

    public static int longestCommonSubsequence(String text1, String text2) {
        int[][] dpMat = new int[text1.length() + 1][text2.length() + 1];
        for (int[] row : dpMat) {
                Arrays.fill(row, 0);
        }

        for (int i = 1; i <= text1.length(); i++) {
            for (int j = 1; j <= text2.length(); j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dpMat[i][j] = 1 + dpMat[i - 1][j - 1];
                } else {
                    dpMat[i][j] = Math.max(dpMat[i - 1][j], dpMat[i][j - 1]);
                }
            }
        }
        return dpMat[text1.length()][text2.length()];
    }
}
