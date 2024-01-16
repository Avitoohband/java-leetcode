package src.removeduplicatedfromsortedarray;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2};
        Solution.removeDuplicates(nums);



    }

    public static class Solution {
        public static int removeDuplicates(int[] nums) {
            int uniIndex = 1;
            for(int j = 1 ; j < nums.length ; j++){
               if( nums[j] != nums[j-1]){
                   nums[uniIndex - 1] = nums[j];
                   uniIndex++;
               }
            }
            return uniIndex;
        }
    }
}
