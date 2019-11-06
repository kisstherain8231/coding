package coding_169;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class Solution {
    public int majorityElement(int[] nums) {
        int size = nums.length;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int tmp = nums[i];
            if (map.get(tmp) == null) {
                map.put(tmp, 1);
            } else {
                int count = map.get(tmp);
                count++;
                map.put(tmp, count);

            }
        }

        int result = 0;

        for (Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > size/2) {
                result =  entry.getKey();

                break;
            }
        }

        return result;
    }


    public static void main(String[] args) {
        Solution solution =  new Solution();
        int nums [] = {2, 1, 2};
        int result =  solution.majorityElement(nums);

        System.out.print(result);
    }
}
