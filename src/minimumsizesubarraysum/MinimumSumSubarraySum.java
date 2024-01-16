package src.minimumsizesubarraysum;

public class MinimumSumSubarraySum {
    public static void main(String[] args) {
        int target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};
        System.out.println(minSubArrayLen(target, nums));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int minLength = nums.length;
        int tempSum = 0;
        int left = 0 ;

        for (int right = 0; right < nums.length; right++) {
            tempSum += nums[right];

            while(tempSum >= target){
                tempSum -= nums[left];
                minLength = Math.min(minLength,right - left + 1);
                left++;
            }
        }

        return tempSum == target ? minLength : 0;
    }

}
