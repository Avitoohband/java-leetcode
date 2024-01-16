package src.houserobber;

import java.util.Arrays;

public class HouseRobber {
    public static void main(String[] args) {

//        int[] nums = {1, 2, 3, 1};
        int[] nums = {2, 7, 9, 3, 1};

        System.out.println(rob(nums));



    }

    public static int rob(int[] nums) {
        int[] dpArray = new int[nums.length + 1];
        Arrays.fill(dpArray, Integer.MIN_VALUE);
        return robHelper(nums, nums.length, dpArray);
    }

    private static int robHelper(int[] nums,int house, int[] dpArray){
        if(house <= 0) return 0;

        if(dpArray[house] != Integer.MIN_VALUE) return dpArray[house];

        int nextHouse = nums[house - 1] + robHelper(nums, house - 2, dpArray);
        int newRound = robHelper(nums, house - 1, dpArray);


        dpArray[house] = Math.max(nextHouse,newRound);
        return Math.max(nextHouse,newRound);

    }
}
