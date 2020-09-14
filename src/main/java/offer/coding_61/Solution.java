package offer.coding_61;

import java.util.HashSet;
import java.util.Set;

class Solution {

    public boolean isStraight(int[] nums) {
        Set<Integer> set = new HashSet<>();

        /**
         *
         * 注意最大和最小的问题，0 比任何值都小，但是不能计算到最小值里
         *
          */
        int min = 14;
        int max = 0;

        for (int tuple : nums) {
            if (tuple == 0) {

                continue;
            }
            if (set.contains(tuple)) {

                return false;
            } else {
                set.add(tuple);
            }

            max = Math.max(max, tuple);
            min = Math.min(min, tuple);
        }

        if (max - min < 5) {
            return true;
        } else {
            return false;
        }
    }
}
