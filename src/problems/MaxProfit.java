package problems;

public class MaxProfit {
    public int maxProfitFIXIT(int[] prices) {
        int maxProfit = 0;

        for (int outerIndex = 0; outerIndex < prices.length; outerIndex++) {
            for (int innerIndex = outerIndex + 1; innerIndex < prices.length; innerIndex++) {

                int diffrence = prices[innerIndex] - prices[outerIndex];
                if (maxProfit < diffrence) {
                    maxProfit = diffrence;
                }
            }
        }
        if (maxProfit > 0) {
            return maxProfit;
        }
        return 0;
    }

    public int maxProfit(int[] prices){
        int smallestPrice = prices[0];
        int profit = 0;
        for(int currIndex = 0; currIndex < prices.length; currIndex++){
            if(prices[currIndex] < smallestPrice){
                smallestPrice = prices[currIndex];
            }
            if(prices[currIndex] - smallestPrice > profit){
                profit = prices[currIndex] - smallestPrice;
            }
        }
        return profit;
    }
}
