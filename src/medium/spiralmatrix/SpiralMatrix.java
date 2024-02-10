package src.medium.spiralmatrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println(spiralOrder(matrix));

    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();

        int up = 0;
        int down = matrix.length - 1;

        int left = 0;
        int right = matrix[0].length - 1;

        while (up <= down && left <= right) {
            for (int leftToRight = left; leftToRight <= right; leftToRight++) {
                res.add(matrix[up][leftToRight]);
            }
            up++;

                for (int upToDown = up; upToDown <= down; upToDown++) {
                    res.add(matrix[upToDown][right]);
                }
            right--;

            if (left <= right) {
                for (int rightToLeft = right; rightToLeft >= left; rightToLeft--) {
                    res.add(matrix[down][rightToLeft]);
                }
            }
            down--;

            if (up <= down) {
                for (int downToUp = down; downToUp >= up; downToUp--) {
                    res.add(matrix[downToUp][left]);
                }
            }
            left++;
        }

        return res;
    }
}
