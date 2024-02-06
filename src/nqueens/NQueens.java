package src.nqueens;

import java.util.*;

public class NQueens {
    public static void main(String[] args) {
        System.out.println(solveNQueens(4));
    }


    public static List<List<String>> solveNQueens(int n) {
        Set<Integer> positiveDiagonal = new HashSet<>(); // row + col
        Set<Integer> negativeDiagonal = new HashSet<>(); // row - col
        Set<Integer> colSet = new HashSet<>(); // row - col
        List<List<String>> solutions = new ArrayList<>();
        boolean[][] board = new boolean[n][n];
        for (boolean[] row : board) {
            Arrays.fill(row, false);
        }
        solve(board, positiveDiagonal, negativeDiagonal, colSet, 0, 0, solutions);

        return solutions;
    }

    private static void solve(boolean[][] board, Set<Integer> pos, Set<Integer> neg, Set<Integer> colSet,
                              int numOfQueens, int row, List<List<String>> solutions) {
        if (numOfQueens >= board.length) {
            solutions.add(convertResponse(board));
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (colSet.contains(col) || pos.contains(row + col) || neg.contains(row - col)) {
                continue;
            }

            board[row][col] = true;
            colSet.add(col);
            pos.add(row + col);
            neg.add(row - col);

            solve(board, pos, neg, colSet, numOfQueens + 1, row + 1, solutions);

            board[row][col] = false;
            colSet.remove(col);
            pos.remove(row + col);
            neg.remove(row - col);


        }
    }

    private static List<String> convertResponse(boolean[][] board) {
        List<String> solution = new ArrayList<>();
        for (boolean[] arrayRow : board) {
            StringBuilder row = new StringBuilder();
            for (boolean col : arrayRow) {
                row.append(col ? 'Q' : '.');
            }
            solution.add(row.toString());
        }
        return solution;
    }
}
