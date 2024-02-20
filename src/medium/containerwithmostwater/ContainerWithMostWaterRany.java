package src.medium.containerwithmostwater;

public class ContainerWithMostWaterRany {
    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.printf("Max container is: %d liters%n", maxArea(arr));
    }

    public static int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;

        int max = Integer.MIN_VALUE;

        while (left != right) {
            max = Math.max(max, area(heights, left, right));
            boolean ordered = heights[left] < heights[right];
            left += ordered ? 1 : 0;
            right -= ordered ? 0 : 1;
        }

        return max;
    }

    private static int area(int[] heights, int left, int right) {
        int base = right - left;
        int minBar = Math.min(heights[left], heights[right]);

        return base * minBar;
    }

    // https://leetcode.com/problems/container-with-most-water/?envType=study-plan-v2&envId=top-interview-150
}

