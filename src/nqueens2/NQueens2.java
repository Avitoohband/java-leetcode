package src.nqueens2;

import java.util.HashSet;
import java.util.Set;

public class NQueens2 {
    public static void main(String[] args) {
        int n = 4;

        System.out.println(totalNQueens(n));

    }

    public static int totalNQueens(int n) {
        Set<Integer> pos = new HashSet<>();
        Set<Integer> neg = new HashSet<>();
        Set<Integer> col = new HashSet<>();
        Set<Integer> row = new HashSet<>();

        return solve(n, 0, pos, neg, col, row);

    }

    public static int solve(int n, int numberOfQueens, Set<Integer> pos,
                            Set<Integer> neg, Set<Integer> col, Set<Integer> row) {
        if (numberOfQueens == n) {
            return 1;
        }
        ;

        int numberOfWays = 0;
        for (int i = 0; i < n; i++) {
            if (
                    !col.contains(i) &&
                            !row.contains(numberOfQueens) &&
                            !pos.contains(numberOfQueens + i) &&
                            !neg.contains(numberOfQueens - i)) {
                col.add(i);
                row.add(numberOfQueens);
                pos.add(numberOfQueens + i);
                neg.add(numberOfQueens - i);
                numberOfWays += solve(n, numberOfQueens + 1, pos, neg, col, row);

                col.remove(i);
                row.remove(numberOfQueens);
                pos.remove(numberOfQueens + i);
                neg.remove(numberOfQueens - i);
            }

        }
        return numberOfWays;
    }

}


