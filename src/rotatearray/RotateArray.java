package src.rotatearray;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7}; // [5,6,7,1,2,3,4]
        int k = 3;
//        int[] nums = {-1, -100, 3, 99}; // [3,99,-1,-100]
//        int k = 2;
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));

    }

    public static void rotate(int[] nums, int k) {
        swap(nums, 0, nums.length - 1);
        swap(nums, 0, k - 1);
        swap(nums, k, nums.length - 1);

    }

    public static void swap(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
