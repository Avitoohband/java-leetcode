package src.longestincreasingsubsequence;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 2, 3};
        int[] nums2 = {7, 7, 7, 7, 7, 7, 7};
        System.out.println(lengthOfLIS(nums));

    }

    public static int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);

        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int max = 1;
        for (int i = 1; i < dp.length; i++) {
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
