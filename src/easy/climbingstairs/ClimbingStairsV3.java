package src.easy.climbingstairs;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairsV3 {
    public int climbStairs(int n) {
        Map<Integer, Integer> dp = new HashMap<>();
        return climbStairsHelper(n, dp);
    }

    private int climbStairsHelper(int n, Map<Integer, Integer> dp) {
        if (n == 0) return 1;
        if (n < 0) return 0;
        if (dp.containsKey(n)) return dp.get(n);
        dp.put(n, climbStairsHelper(n - 1, dp) + climbStairsHelper(n - 2, dp));
        return climbStairsHelper(n - 1, dp) + climbStairsHelper(n - 2, dp);
    }
}
