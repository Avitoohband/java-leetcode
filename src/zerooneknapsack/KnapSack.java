package src.zerooneknapsack;

public class KnapSack {
    public static void main(String[] args) {
        int[] values = {30, 20, 50, 20, 50, 20, 50, 20, 50, 20, 50, 20, 50, 20, 50, 20, 50, 20, 50, 20, 50, 20, 50, 20,
                50, 20, 50, 20, 50, 20, 50, 20, 50};
        int[] weights = {10, 40, 20, 40, 20, 40, 20, 40, 20, 40, 20, 40, 20, 40,
                20, 40, 20, 40, 20, 40, 20, 40, 20, 40, 20, 40, 20, 40, 20, 40, 20, 40, 20};
        int weight = 500;
        int capacity = values.length;

        long startTime = System.currentTimeMillis();

        System.out.println(knapSack(capacity, weight, weights, values));

        System.out.println((System.currentTimeMillis() - startTime) / 1_000);

    }

    public static int knapSack(int capacity, int weight, int[] weights, int[] values) {
        if (capacity == 0 || weight == 0) return 0;

        if (weights[capacity - 1] > weight) {
            return knapSack(capacity - 1, weight, weights, values);
        }

        int include = values[capacity - 1]
                + knapSack(capacity - 1,
                weight - weights[capacity - 1], weights, values);

        int exclude = knapSack(capacity - 1,
                weight, weights, values);

        return Math.max(include, exclude);

    }
}
