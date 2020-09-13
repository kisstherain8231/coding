package offer.coding_63;

class Solution {
    public int maxProfit(int[] prices) {
        if (null == prices) {
            return 0;
        }

        if (prices.length == 0) {
            return 0;
        }
        int max = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (min > prices[i]) {
                min = prices[i];
            }

            int profile = prices[i] - min;

            if (profile > max) {
                max = profile;
            }
        }

        return max;
    }
}
