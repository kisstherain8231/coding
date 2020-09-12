package offer.coding_51;

class Solution {
    public int reversePairs(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            for (int k = 0; k < i; k++) {
                if (nums[k] > nums[i]) {
                    count++;
                }
            }
        }

        return count;
    }
}
