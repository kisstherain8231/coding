package coding_238;

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int [] l2r = new int[len];

        int [] r2l = new int[len];

        int [] result = new int[len];

        l2r[0] = nums[0];
        for (int i = 1; i < len; i++) {
            l2r[i] = l2r[i - 1] *  nums[i];
        }

        r2l[len - 1] = nums[len - 1];
        for (int i = len -1 - 1; i >=0; i--) {
            r2l[i] = nums[i] * r2l[i + 1];
        }

        for (int i = 1; i <= len - 1 -1; i++) {
            result[i] = l2r[i-1] * r2l[i+1];
        }

        result[0] = r2l[1];
        result[len - 1] = l2r[len - 1 -1];

        return result;
    }
}
