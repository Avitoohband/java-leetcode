package src.maxbuysellstock;

public class MaxBuySellStock {

    public int maxProfit(int[] prices) {
        int profit = 0 ;
        int buy = 0 ;
        int sell = 1;
        while (sell < prices.length ){
            if(prices[buy] > prices[sell]){
                buy = sell++;
                continue;
            }
            int pot = prices[sell] - prices[buy];
            profit = profit > pot ? profit : pot;
            sell++;
        }
        return profit;
    }
}
