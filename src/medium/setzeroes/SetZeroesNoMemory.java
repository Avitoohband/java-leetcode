package src.medium.setzeroes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetZeroesNoMemory {
    public static void main(String[] args) {
        int[][] mat = {{1, 1, 1,}, {1, 0, 1}, {1, 1, 1}};
        int[][] mat2 = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
//        set(mat2);
        for (int[] row : mat2) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void set(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (matrix[row][col] == 0) mark(matrix, row, col);
            }
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (matrix[row][col] == -1000) matrix[row][col] = 0;
            }
        }
    }

    private static void mark(int[][] matrix, int row, int col) {
        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[row][i] != 0) matrix[row][i] = -1000;
        }
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][col] != 0) matrix[i][col] = -1000;
        }
    }
}