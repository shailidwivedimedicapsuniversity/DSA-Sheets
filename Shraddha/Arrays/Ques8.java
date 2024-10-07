package Shraddha.Arrays;

public class Ques8 {
    // Best time to Buy and Sell Stock
    public int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        int curProfit ;
        for(int i=0; i<prices.length; i++){
            if(buyPrice>prices[i]){
                // update the price
                buyPrice = prices[i];
            }   else{
                // buyprice < today's price 
                // profit case 
                curProfit =  prices[i] - buyPrice ;
                maxProfit = Math.max(maxProfit, curProfit);
            }
        }
        return maxProfit;
    }
    
}
