package src.easy.removeduplicatedfromsortedarray;

public class RemoveDuplicatesV2 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2};
        Solution.removeDuplicates(nums);



    }

    public static class Solution {
        public static int removeDuplicates(int[] nums) {
            int uniqueIndex = 0;
            for (int i = 1; i < nums.length; i++) {
                if(nums[i] != nums[uniqueIndex]){
                    nums[++uniqueIndex] = nums[i];
                }
            }
            return uniqueIndex + 1;
        }
    }
}
