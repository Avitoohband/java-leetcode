package src.permutations;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(permute(nums));
        //Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]

    }

    public static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> solutions = new ArrayList<>();
        solve(solutions, new ArrayList(), nums);
        return solutions;
    }

    private static void solve(List<List<Integer>> solutions,
                              List<Integer> currentComb, int[] nums){
        if(currentComb.size() == nums.length){
            solutions.add(new ArrayList<>(currentComb));
            return;
        }
        for (int num : nums) {
            if (!currentComb.contains(num)) {
                currentComb.add(num);
                solve(solutions, currentComb, nums);
                currentComb.removeLast();
            }
        }
    }
}
