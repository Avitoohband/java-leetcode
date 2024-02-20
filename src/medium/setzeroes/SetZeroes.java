package src.medium.setzeroes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetZeroes {
    public static void main(String[] args) {
        int[][] mat = {{1, 1, 1,}, {1, 0, 1}, {1, 1, 1}};
        set(mat);
        for (int[] row : mat) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void set(int[][] matrix) {
        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();

        initSets(matrix, row, col);
        insertZeroes(matrix, row, col);


    }

    private static void initSets(int[][] matrix, Set<Integer> row, Set<Integer> col) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row.add(i);
                    col.add(j);
                }
            }
        }
    }

    private static void insertZeroes(int[][] matrix, Set<Integer> row, Set<Integer> col) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (row.contains(i) || col.contains(j)) matrix[i][j] = 0;
            }
        }
    }
}