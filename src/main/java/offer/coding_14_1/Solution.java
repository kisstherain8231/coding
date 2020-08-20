package offer.coding_14_1;

/**
 *
 *
 */
class Solution {
    public int cuttingRope(int n) {
        int res  = 0;

        int dp [] = new int [n+1];

        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 2;

        for (int i = 4; i <= n; i++) {

            int max = 0;

            for (int k = 1; k < i; k++) {
                int tmp = Math.max(dp[i - k],  i - k)* Math.max(dp[k], k);
                if (tmp > max) {
                    max = tmp;
                }
            }

            dp[i] = max;
        }


        return dp[n];
    }





}
