package src.climbingstairs;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 50;

        System.out.println(climbStairs(n));

    }
    public static int climbStairs(int n){
        Map<Integer, Integer> memo = new HashMap<>();
        return climbStairsHelper(n, memo);
    }

    private static int climbStairsHelper(int n, Map<Integer,Integer> memo){
        if(memo.containsKey(n)) return memo.get(n);
        if(n == 0 ) return 1;
        if (n < 0) return 0;

        memo.put(n, climbStairsHelper(n-1,memo) + climbStairsHelper(n-2,memo));
        return memo.get(n);
    }
}
