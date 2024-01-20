package src.combinations;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

    public static void main(String[] args) {

        int n = 4, k = 2;

        System.out.println(combine(n, k));
        // Output: [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]

    }

    public static List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> solutions = new ArrayList<>();
        solve(new ArrayList<>(), solutions, 1, n, k);
        return solutions;

    }

    private static void solve(List<Integer> currentComb, List<List<Integer>> solutions,
                              int currentNum, int n, int k) {
        if (currentComb.size() == k) {
            solutions.add(new ArrayList<>(currentComb));
            return;
        }
        for (int i = currentNum; i <= n - (k - currentComb.size()) + 1; i++) {
            currentComb.add(i);
            solve(currentComb, solutions, i + 1, n, k);
            currentComb.remove(currentComb.size() - 1);
        }
    }
}

