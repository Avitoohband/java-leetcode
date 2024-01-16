package src.coinchange;

public class CoinChange {
    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int[] coins2 = {1, 5, 6, 9};
        int[] coins3 = {3};

        int amount = 3;
        int amount2 = 11;
        int amount3 = 2;
        System.out.println(coinChange(coins, amount));
        System.out.println(coinChange(coins2, amount2));
        System.out.println(coinChange(coins3, amount3));
    }

    public static int coinChange(int[] coins, int amount) {
        if (amount < 1) return 0;

        int[] coinArrayDP = new int[amount + 1];

        for (int i = 1; i <= amount; i++) {
            coinArrayDP[i] = Integer.MAX_VALUE;
            for (int coin : coins) {
                if (coin <= i && coinArrayDP[i - coin] != Integer.MAX_VALUE) {
                    coinArrayDP[i] = Math.min(coinArrayDP[i], 1 + coinArrayDP[i - coin]);
                }
            }


        }
        if (coinArrayDP[amount] == Integer.MAX_VALUE) return -1;
        return coinArrayDP[amount];

    }
}
