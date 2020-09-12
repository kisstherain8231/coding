package offer.coding_53_2;

class Solution {
    public int missingNumber(int[] nums) {
        int res = Integer.MIN_VALUE;
        for (int i = 1; i < nums.length; i++) {
            int tmp = nums[i];
            if (nums[i] - nums[i-1] != 1) {
                res = nums[i-1] + 1;

                break;
            }
        }

        return res;
    }
}
