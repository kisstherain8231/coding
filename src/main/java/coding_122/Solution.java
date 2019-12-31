package coding_122;

public class Solution {
    public int maxProfit(int[] prices) {

        int i  = 0;
        int k = 1;

        int len = prices.length;
        int maxProfit = 0;

        while (k < len) {
            // increase
           if ( prices[k] >  prices[i]) {
               maxProfit = maxProfit +  (prices[k] -  prices[i]);
           }

           i++;
           k++;
        }


        return maxProfit;

    }
}
