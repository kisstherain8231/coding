package offer.coding_21;

class Solution {
    public int[] exchange(int[] nums) {

        int i = 0;
        int k = nums.length - 1;

        while (i <= k) {
            // 奇数和偶数的位置不符条件
            if ((nums[i] % 2 == 0) && (nums[k] % 2 == 1)) {
                int tmp = nums[i];
                nums[i] = nums[k];
                nums[k] = tmp;
                i++;
                k--;
            } else if (nums[i] % 2 == 1) {
                i++;
            } else if (nums[k] % 2 == 0) {
                k--;
            }
        }

        return nums;
    }
}
