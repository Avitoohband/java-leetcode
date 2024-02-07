package src.sudokusolver;

import javax.swing.*;
import java.util.Arrays;

public class SudokuSolver {
    public static void main(String[] args) {
    }

    public static void solveSudoku(char[][] board) {
        solve(board, 0, 0);
    }

    private static boolean solve(char[][] board, int row, int col) {
        if (row == board.length) return true;
        if (col == board[0].length) return solve(board, row + 1, 0);
        if (board[row][col] != '.') return solve(board, row, col + 1);

        for (int i = 1; i <= 9; i++) {
            char ch = (char) (i + '0');
            if (isValid(board, row, col, ch)) {
                board[row][col] = ch;
                if (solve(board, row, col + 1)) return true;
            }
            board[row][col] = '.';
        }
        return false;
    }

    private static boolean isValid(char[][] board, int row, int col, char ch) {
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == ch) return false;
            if (board[i][col] == ch) return false;
            if (board[3 * (row / 3) + (i / 3)][3 * (col / 3) + (i % 3)] == ch) return false;
        }
        return true;
    }

    private static void printBoard(char[][] board) {
        for (char[] row : board) {
            System.out.println(Arrays.toString(row));
        }
    }
}
