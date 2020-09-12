package offer.coding_50;

import java.util.HashMap;
import java.util.Map;


//"dddccdbba"
class Solution {

    public char firstUniqChar(String s) {
        //Set<Character> set = new HashSet<>();
        Map<Character, Integer> map = new HashMap<>();
        char res = ' ';

        char[] chars = s.toCharArray();

        for (int i = chars.length - 1; i >= 0; i--) {
            char tuple = chars[i];
            Integer value = map.get(tuple);
            if (null == value) {
                map.put(tuple, 1);
            } else {
                map.put(tuple, value + 1);
            }
        }
        // set only contains the once char

        for (int i = 0; i < chars.length; i++) {
            char tuple = chars[i];

            int value = map.get(tuple);
            if (value == 1) {
                res = tuple;

                break;
            }
        }

        return res;
    }
}
