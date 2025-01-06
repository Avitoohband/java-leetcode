package src.easy.maxbuysellstock;

public class MaxBuySellStockV3 {
    public int maxProfit(int[] prices) {
        int buy = 0;
        int sell = 0;
        int max = 0 ;

        while(sell < prices.length){
            max = Math.max( max, prices[sell] - prices[buy]);
            if(prices[sell] < prices[buy]) buy = sell;
            sell++;
        }
        return max;
    }
}
