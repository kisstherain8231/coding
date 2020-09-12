package offer.coding_59;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        if (nums == null || nums.length == 0) {
            return new int[0];
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i + k  -1 < nums.length; i++) {
            int val = calFixLenMax(nums, k, i);
            list.add(val);
        }

        int size = list.size();

        int res [] = new int[size];
        for (int i = 0; i < size; i++) {
            res[i] = list.get(i);
        }

        return res;
    }

    public int calFixLenMax(int [] nums, int k, int start) {

        int max =  nums[start];

        for (int i = start ; i < start + k; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }

        return max;
    }
}
