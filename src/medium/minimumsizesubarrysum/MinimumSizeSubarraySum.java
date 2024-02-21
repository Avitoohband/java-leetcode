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
        int minLen = Integer.MAX_VALUE;
        int currentSum = 0;
        int start = 0 ;

        for (int end = 0; end < nums.length; end++) {
            currentSum += nums[end];

            while (currentSum >= target){
                minLen = Math.min(minLen, end - start + 1 );
                currentSum -= nums[start++];
            }
        }
        return minLen != Integer.MAX_VALUE ? minLen : 0;
    }
}
