package src.medium.spiralmatrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println(spiralOrder(matrix));

    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> response = new ArrayList<>();

        int up = 0, down = matrix.length - 1, left = 0, right = matrix[0].length - 1;

        while (up <= down && left <= right) {
            for (int l = left; l <= right; l++) {
                response.add(matrix[up][l]);
            }
            up++;

            for (int u = up; u <= down; u++) {
                response.add(matrix[u][right]);
            }
            right--;

            if (up <= down) {
                for (int r = right; r >= left; r--) {
                    response.add(matrix[down][r]);
                }
            }
            down--;

            if (left <= right) {
                for (int d = down; d >= up; d--) {
                    response.add(matrix[d][left]);
                }
            }
            left++;
        }


        return response;
    }
}
