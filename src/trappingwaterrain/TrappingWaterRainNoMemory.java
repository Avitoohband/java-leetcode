package src.trappingwaterrain;

public class TrappingWaterRainNoMemory {
    public static void main(String[] args) {
        int[] water = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(water));

    }

    public static int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxLeft = 0;
        int maxRight = 0;
        int trappedWater = 0;

        while (left < right) {
            if (height[left] < height[right]){
                maxLeft = Math.max(height[left],maxLeft);
                trappedWater += Math.max(maxLeft - height[left++], 0);
            }else {
                maxRight = Math.max(height[right],maxRight);
                trappedWater += Math.max(maxRight - height[right--], 0);
            }
        }
        return trappedWater;
    }
}

//https://leetcode.com/problems/trapping-rain-water/description/?envType=study-plan-v2&envId=top-interview-150
