package coding_136;

import java.util.HashMap;
import java.util.Map;

public class Solution {



    public int singleNumber(int[] nums) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
           if (map.containsKey(nums[i])) {
               Integer count = map.get(nums[i]);
               int num = count.intValue();
               num++;
               map.put(nums[i], new Integer(num));
           } else {
               int count = 1;

               map.put(nums[i], count);
           }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();

            Integer value = entry.getValue();

            if (value.intValue() == 1) {
                result = key;
                break;
            }

        }

        return result;
    }

}
