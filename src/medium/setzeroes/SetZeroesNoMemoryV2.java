package src.medium.setzeroes;

import java.util.Arrays;

public class SetZeroesNoMemoryV2 {

    public static void main(String[] args) {
        int[][] mat = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };
        set(mat);

        for (int[] row : mat) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void set(int[][] matrix) {
        boolean firstRow = false;
        boolean firstCol = false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    firstRow = i == 0 || firstRow;
                    firstCol = j == 0 || firstCol;
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[0][j] == 0 || matrix[i][0] == 0) matrix[i][j] = 0;
            }
        }

        if (firstRow) {
            Arrays.fill(matrix[0], 0);
        }
        if (firstCol) {
            for (int i = 0; i < matrix.length; i++) {
                    matrix[i][0] = 0;
            }
        }

    }
}
