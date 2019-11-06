package coding_121;



class Solution {
    public int maxProfit(int[] prices) {

        if (prices == null) {
            return 0;
        }

        if (prices.length == 0) {
            return 0;
        }

        int min = prices[0];
        int max = 0;

        for (int i = 0; i < prices.length; i++) {
            if (min > prices[i]) {
                min = prices[i];
            }
            int tmp = prices[i];
            if ((tmp - min) > max) {
                max = tmp - min;
            }
        }

        return max;
    }
}
