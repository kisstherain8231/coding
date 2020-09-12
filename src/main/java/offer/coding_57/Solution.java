package offer.coding_57;


import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int remains = target - nums[i];

            Integer value =  map.get(nums[i]);
            if (value  != null) {
                res[1] = nums[i];
                res[0] = value;

                break;
            } else {
                map.put(remains, nums[i]);
            }

        }

        return res;

    }
}
