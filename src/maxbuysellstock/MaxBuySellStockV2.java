package src.maxbuysellstock;

public class MaxBuySellStockV2 {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int dayOpenPost = prices[0] ;
        int totalProfit = 0;
        for( int i = 1 ; i < prices.length; i++){
            dayOpenPost = prices[i] < dayOpenPost ? prices[i] : dayOpenPost;
            if(prices[i] > prices[i-1]){
                totalProfit += prices[i] - dayOpenPost;
                dayOpenPost = prices[i];
            }

        }
        return totalProfit;
    }
}
