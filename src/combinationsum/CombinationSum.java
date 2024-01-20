package src.combinationsum;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;

        System.out.println(combinationSum(candidates, target));

    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> solutions = new ArrayList<>();

        solve(solutions, new ArrayList<>(), candidates, target, 0);

        return solutions;

    }

    private static void solve(List<List<Integer>> solutions,List<Integer> currentComb,
                              int[] candidates, int target, int start){
        if(target == 0){
            solutions.add(new ArrayList<>(currentComb));
            return;
        }
        if(target < 0){
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            int candidate = candidates[i];
            currentComb.add(candidate);
            solve(solutions, currentComb, candidates, target - candidate, i);
            currentComb.removeLast();
        }
    }
}
