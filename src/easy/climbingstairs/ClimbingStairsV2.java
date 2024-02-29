package src.easy.climbingstairs;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairsV2 {
    public static int climbStairs(int n) {
        Map<Integer, Integer> stairsMap = new HashMap<>();

        return solve(n, stairsMap);
    }

    private static int solve(int n, Map<Integer, Integer> stairsMap) {
        if (stairsMap.containsKey(n)) return stairsMap.get(n);
        if (n == 0) {
            return 1;
        }
        if (n < 0) return 0;

        stairsMap.put(n, solve(n - 1, stairsMap) + solve(n - 2, stairsMap));
        return stairsMap.get(n);
    }
}
