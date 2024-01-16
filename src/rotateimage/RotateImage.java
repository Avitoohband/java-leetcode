package src.rotateimage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("Before rotate");
        System.out.println(Arrays.deepToString(matrix));

        rotate(matrix);
        System.out.println("After rotate");
        System.out.println(Arrays.deepToString(matrix));

    }

    public static void rotate(int[][] matrix) {

        //transition rows into columns and vise-versa
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //reverse each row
        for (int[] intArr : matrix) {
            int left = 0;
            int right = intArr.length - 1;
            while (left < right) {
                int temp = intArr[left];
                intArr[left] = intArr[right];
                intArr[right] = temp;
                left++;
                right--;

            }

        }

    }
}

