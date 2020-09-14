package offer.coding_51;

class Solution {

    public int reversePairs(int[] nums) {
        if (null == nums) {
            return 0;
        }
        if (nums.length < 2) {
            return 0;
        }

        int[] cpy = new int[nums.length];
        int[] tmp = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            cpy[i] = nums[i];
        }

        return reversePairs(cpy, 0, nums.length - 1, tmp);
    }

    public int reversePairs(int[] nums, int left, int right, int[] tmp) {
        if (left == right) {

            return 0;
        }

        int mid = left + (right - left) / 2;

        int leftPairs = reversePairs(nums, left, mid, tmp);
        int rightPairs = reversePairs(nums, mid + 1, right, tmp);

        if (nums[mid] <= nums[mid + 1]) {
            return leftPairs + rightPairs;
        }
        int crossPairs = mergeAndCount(nums, left, mid, right, tmp);

        return leftPairs + rightPairs + crossPairs;
    }

    public int mergeAndCount(int[] nums, int left, int mid, int right, int[] tmp) {

        for (int i = left; i <= right; i++) {
            tmp[i] = nums[i];
        }

        int i = left;
        int j = mid + 1;

        int count = 0;
        for (int k = left; k <= right; k++) {
            if (i == mid + 1) {
                nums[k] = tmp[j];
                j++;
            } else if (j == right + 1) {
                nums[k] = tmp[i];
                i++;
            } else if (tmp[i] <= tmp[j]) {
                nums[k] = tmp[i];
                i++;
            } else {
                nums[k] = tmp[j];
                j++;
                count = count + (mid - i + 1);

            }
        }

        return count;
    }
}
