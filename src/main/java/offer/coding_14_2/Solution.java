package offer.coding_14_2;


class Solution {
    public int cuttingRope(int n) {
        int dp [] = new int [n+1];
        dp[1] = 1;
        dp[2] = 1;

        for (int i = 3; i <= n; i++) {
            int max = 0;

            for (int k = 1; k < i; k++) {
                int tmp = Math.max(dp[i - k] % 1000000007 , (i - k)% 1000000007)
                    * Math.max(dp[k] % 1000000007, k % 1000000007);
                if (tmp > max) {
                    max = tmp;
                }
            }

            dp[i] = max;
        }

        return dp[n] % 1000000007;
    }
}
