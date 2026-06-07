
//import java.util.Math;
class Solution {
    public int maxProfit(int[] prices) {
       
       int minPrice = prices[0];
       int maxProfit = 0;

       for(int i = 1; i < prices.length; i++){
        // Max Profit
         maxProfit = Math.max(maxProfit, prices[i]-minPrice);
        // cheapest price so far
        minPrice = Math.min(minPrice,prices[i]);
        
       }
       return maxProfit;
    }

}
