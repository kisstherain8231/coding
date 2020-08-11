package coding_053;

class Solution {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int  [] dp =  new int[len];

        int result = 0;

        for (int j = 0; j < len; j++) {
            dp[j] = nums[j];
        }

        result = dp[0];
        // [-2,1,-3,4,-1,2,1,-5,4]
        for (int i = 1; i < len; i++) {
           int summary = dp[i - 1] + nums[i];

           if (summary > nums[i]) {
               dp[i] = summary;
           }

           if (result < dp[i]) {
               result = dp[i];
           }
        }

        return result;
    }
}
