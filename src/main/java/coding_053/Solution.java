package coding_053;

class Solution {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int  [] [] dp = new int[len][len];

        int result = 0;

        for (int j = 0; j < len; j++) {
            dp[j][j] = nums[j];
        }

        result = dp[0][0];
        // [-2,1,-3,4,-1,2,1,-5,4]
        for (int i = 0; i < len; i++) {
            for (int k = i + 1; k < len; k++) {
                dp[i][k] = dp[i][k -1] + nums[k];

                if (dp[i][k] > result) {
                    result = dp[i][k];
                }
            }
        }

        return result;
    }
}
