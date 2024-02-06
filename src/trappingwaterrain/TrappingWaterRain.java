package src.trappingwaterrain;

public class TrappingWaterRain {
    public static void main(String[] args) {

    }

    public static int trap(int[] height) {
        int trappingWater = 0;
        int[] leftWall = new int[height.length];
        int[] rightWall = new int[height.length];

        for (int i = 1; i < leftWall.length; i++) {
            leftWall[i] = Math.max(leftWall[i - 1], height[i - 1]);
        }

        for (int i = rightWall.length - 2; i >= 0; i--) {
            rightWall[i] = Math.max(rightWall[i + 1], height[i + 1]);
        }

        for (int i = 0; i < height.length; i++) {
            trappingWater += Math.max(0, Math.min(leftWall[i], rightWall[i]) - height[i]);
        }

        return trappingWater;
    }
}

//https://leetcode.com/problems/trapping-rain-water/description/?envType=study-plan-v2&envId=top-interview-150
