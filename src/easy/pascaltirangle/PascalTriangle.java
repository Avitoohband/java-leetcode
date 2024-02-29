package src.easy.pascaltirangle;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PascalTriangle {
    public static void main(String[] args) {

    }

    public static List<List<Integer>> generate(int numRows) {
        if (numRows <= 0) return List.of();
        int[][] triangle = new int[numRows][];
        for (int i = 0; i < numRows; i++) {
            int[] row = new int[i + 1];
            row[0] = 1;
            row[i] = 1;
            for (int k = 1; k < i; k++) {
                row[k] = triangle[i - 1][k - 1] + triangle[i - 1][k];
            }
            triangle[i] = row;
        }
        return Arrays.stream(triangle)
                .map(row -> Arrays.stream(row)
                        .boxed()
                        .toList())
                .collect(Collectors.toList());

    }
}
