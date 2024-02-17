package src.easy.twosum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {

    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> diffMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (diffMap.containsKey(nums[i]))
                return new int[]{i, diffMap.get(nums[i])};
            diffMap.put(target - nums[i], i);
        }
        return new int[2];
    }
}
