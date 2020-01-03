package coding_042;

public class Solution {


    /**
     * 状态机： 0 未知和平等的状态
     *
     * @param height
     * @return
     */
    public int trap(int[] height) {
        int result = 0;
        int len = height.length;
        int lMax  = 0;
        int rMax = 0;
        int dp[] = new int[len];

        for (int i = 1; i < height.length; i++) {
            // 左边找最大值
            lMax = height[i];
            rMax = height[i];
            for (int l = i; l >= 0; l--) {
                if (lMax < height[l]) {
                    lMax = height[l];
                }
            }
            // 右边的最大值
            for (int r = i; r < len; r++) {
                if (rMax < height[r]) {
                    rMax = height[r];
                }
            }

            dp[i] = Math.min(lMax, rMax);
        }
        // 计算面积
        for (int i = 0; i < height.length; i++) {
           int tmp = dp[i] - height[i];

           if (tmp > 0) {
               result = result + tmp;
           }
        }

        return result;
    }
}
