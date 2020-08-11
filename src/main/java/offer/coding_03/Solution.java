package offer.coding_03;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findRepeatNumber(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();

        for (int element : nums) {
           Integer count = countMap.get(element);

           if (count == null) {
               count = 1;
               countMap.put(element, count);
           } else {
               return element;
           }
        }

        return 0;
    }
}
