package src.containerwithmostwater;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(arr));

    }

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;

        int maxWater = Integer.MIN_VALUE;

        while (left < right) {
            maxWater = Math.max((
                    (Math.min(height[left], height[right])) * (right - left)
            ), maxWater);
            if (height[left] <= height[right]) left++;
            else right--;
        }
        return maxWater;
    }

    // https://leetcode.com/problems/container-with-most-water/?envType=study-plan-v2&envId=top-interview-150
}

