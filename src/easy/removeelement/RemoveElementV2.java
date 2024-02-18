package src.easy.removeelement;

public class RemoveElementV2 {

    public static void main(String[] args) {

    }

    public static class Solution {
        public static int removeElement(int[] nums, int val) {
            int notValIndex = 0 ;
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] == val) continue;
                nums[notValIndex++] = nums[i];
            }
            return notValIndex;
        }
    }
}
