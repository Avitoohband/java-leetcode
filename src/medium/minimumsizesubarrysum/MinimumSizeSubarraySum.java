package src.medium.minimumsizesubarrysum;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};

        int target2 = 5;
        int[] nums2 = {1, 4, 4};

        System.out.println(minSubArrayLen(target, nums));
        System.out.println(minSubArrayLen(target2, nums2));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int minLen = nums.length + 1;
        for (int i = 0; i < nums.length; i++) {
            int currentSum = nums[i];
            int k = 1;
            while ((i + k) < nums.length && currentSum < target) {
                currentSum += nums[i + k++];
            }
            minLen = Math.min(minLen, k);
        }
        return minLen;
    }
}
