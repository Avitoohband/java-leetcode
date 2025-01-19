package src.medium.uniquepaths;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class UniquePaths {
    public int uniquePaths(int m, int n) {
        return perform(0, 0, m, n, new HashMap<>());
    }

    public int perform(int i, int j, int m, int n,
                       Map<String, Integer> dp) {
        String key = String.format("%d,%d", i, j);
        if (i == m - 1 && j == n - 1) return 1;
        if (i >= m || j >= n) return 0;
        if (dp.containsKey(key)) return dp.get(key);

        dp.put(key,
                perform(i + 1, j, m, n, dp)
                        + perform(i, j + 1, m, n, dp));


        return dp.get(key);

    }
}
