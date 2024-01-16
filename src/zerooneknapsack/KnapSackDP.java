package src.zerooneknapsack;

import java.util.Arrays;

public class KnapSackDP {
    public static void main(String[] args) {
        int[] values = {30, 20, 50, 20, 50, 20, 50, 20, 50, 20, 50, 20, 50, 20, 50, 20, 50, 20, 50, 20, 50, 20, 50, 20,
                50, 20, 50, 20, 50, 20, 50, 20, 50, 20, 50, 20, 50, 20, 50, 20, 50, 20, 50, 20, 50, 20, 50, 20, 50, 20, 50, 20, 50};
        int[] weights = {10, 40, 20, 40, 20, 40, 20, 40, 20, 40, 20, 40, 20, 40,
                20, 40, 20, 40, 20, 40, 20, 40, 20, 40, 20, 40, 20, 40, 20, 40, 20, 40, 20, 40, 20, 40, 20, 40, 20, 40, 20, 40, 20, 40, 20, 40, 20, 40, 20, 40, 20, 40, 20};
        int weight = 500;
        int capacity = values.length;

        int[][] dpArray = new int[capacity + 1][weight + 1];

        for (int[] row : dpArray) {
            Arrays.fill(row, Integer.MIN_VALUE);
        }

        long startTime = System.currentTimeMillis();

        System.out.println(knapSack(capacity, weight, weights, values,dpArray));

        System.out.println((System.currentTimeMillis() - startTime) / 1_000);

    }

    public static int knapSack(int capacity, int weight, int[] weights, int[] values, int[][] dpArray) {
        if (capacity == 0 || weight == 0) return 0;

        if(dpArray[capacity][weight] != Integer.MIN_VALUE) return dpArray[capacity][weight];

        if (weights[capacity - 1] > weight) {
            return knapSack(capacity - 1, weight, weights, values, dpArray);
        }

        int include = values[capacity - 1]
                + knapSack(capacity - 1,
                weight - weights[capacity - 1], weights, values, dpArray);

        int exclude = knapSack(capacity - 1,
                weight, weights, values, dpArray);


        dpArray[capacity][weight] = Math.max(include, exclude);
        return Math.max(include, exclude);

    }
}
