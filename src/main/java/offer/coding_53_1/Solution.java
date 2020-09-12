package offer.coding_53_1;

class Solution {
    public int search(int[] nums, int target) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < target) {
                continue;
            }else if (nums[i] == target) {
                res = res + 1;
            } else if (nums[i] > target) {
                break;
            }
        }

        return res;
    }
}
