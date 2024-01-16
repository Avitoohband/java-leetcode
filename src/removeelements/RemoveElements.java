package src.removeelements;

public class RemoveElements
{
    public static void main(String[] args) {

    }

    public static class Solution {
        public static int removeElement(int[] nums, int val) {
            int uniIndex = 0 ;

            for(int i = 0; i < nums.length; i++){
                if(nums[i] != val){
                    nums[uniIndex++] = nums[i];
                }
            }
            return uniIndex;

        }
    }
}
