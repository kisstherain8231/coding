package offer.coding_39;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int majorityElement(int[] nums) {
        int res = 0;

        int size = nums.length;
        Map<Integer, Integer> map =  new HashMap<>();
        for (int tuple : nums) {
            Integer value = map.get(tuple);

            if (value == null) {
                map.put(tuple, 1);
            } else {
                value = value + 1;
                map.put(tuple, value);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > size / 2) {
                res = entry.getKey();
            }
        }

        return  res;
    }
}
