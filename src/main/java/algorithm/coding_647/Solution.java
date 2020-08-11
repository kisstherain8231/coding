package algorithm.coding_647;

class Solution {

    public int countSubstrings(String s) {
        //dp[i][j]表示s[i...j]是否为回文字串。
        boolean[][] dp = new boolean[s.length()][s.length()];
        int ans = 0;
        for (int i = 0; i < dp.length; i++) {
            dp[i][i] = true;
            ans++;
        }
        for (int i = 1; i < dp.length; i++) {
            if (s.charAt(i - 1) == s.charAt(i)) {
                dp[i - 1][i] = true;
                ans++;
            }
        }
        for (int k = 2; k < s.length(); k++) {
            for (int i = k; i < s.length(); i++) {
                if (s.charAt(i - k) == s.charAt(i) && dp[i - k + 1][i - 1]) {
                    dp[i - k][i] = true;
                    ans++;
                }
            }
        }
        return ans;
    }
}
