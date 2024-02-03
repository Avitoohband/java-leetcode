package src.shuffleanarray;

import java.util.Arrays;

public class ShuffleAnArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        Solution sol = new Solution(nums);
        System.out.println(Arrays.toString(sol.shuffle()));

    }

    public static class Solution {
        private final int[] nums;


        public Solution(int[] nums) {
            this.nums = nums;
        }

        public int[] reset() {
           return nums;
        }

        public int[] shuffle() {
            int[] shuffled = Arrays.copyOf(nums, nums.length);


            //Fisher-Yates
            for (int i = shuffled.length - 1; i > 0; i--) {
                int j = (int) (Math.random() * (i + 1));
                swap(shuffled, i, j);
            }
            return  shuffled;
        }

        private void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}

//https://leetcode.com/problems/shuffle-an-array/?envType=featured-list&envId=top-interview-questions


