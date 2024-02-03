package src.shuffleanarray;

import java.util.Arrays;

public class ShuffleAnArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        Solution sol = new Solution(nums);
        System.out.println(Arrays.toString(sol.shuffle()));

    }

    public static class Solution {
        public int[] nums;

        public Solution(int[] nums) {
            this.nums = nums;
        }

        public int[] reset() {
            return nums;
        }

        public int[] shuffle() {
            int[] shuffled = Arrays.copyOf(nums, nums.length);
            //Fisher-Yates
            for (int i = nums.length - 1; i >= 0; i--) {
                int j = (int) (Math.random() * i);
                swap(i,j);
            }
            return  shuffled;
        }

        private void swap(int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}

//https://leetcode.com/problems/shuffle-an-array/?envType=featured-list&envId=top-interview-questions


