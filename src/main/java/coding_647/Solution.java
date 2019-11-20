package coding_647;

class Solution {
    public int countSubstrings(String s) {
        int result = 0;


        result = doCountSubstrings(s);

        return result;

    }

    int doCountSubstrings(String s) {
        int result = 0;
        int len  = s.length();

        boolean dp [][] = new boolean[len][len];

        for (int i = 1; i <= len; i++) { //回文长度
            for (int k = 0; k < len; k++) {
                if (dp[k + 1][k + i - 1]){

                }
                dp[k][k+i]
            }

        }


    }
}
