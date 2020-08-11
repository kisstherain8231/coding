package coding_75;

class Solution {
    public void sortColors(int[] nums) {

        int l = -1;
        int r = nums.length;

        int i = 0;

        while (i < r) {
            if (nums[i] == 1) {
                i++;
            } else if (nums[i] == 0) {
                l++;
                swap(nums, i, l);
                i++;

            } else if (nums[i] == 2) { //交换
                r--;
                swap(nums, i, r);
            }
        }

    }

    public void swap(int [] nums, int l, int r) {
        int tmp = nums[l];
        nums[l] = nums[r];
        nums[r] = tmp;
    }
}
