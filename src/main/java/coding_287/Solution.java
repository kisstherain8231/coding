package coding_287;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int findDuplicate(int[] nums) {
        int result = 0;

        Set<Integer> set = new HashSet<>();

        for (int i : nums) {
            if (set.contains(i)) {
                result = i;
                break;
            } else {
                set.add(i);
            }
        }

        return result;
    }
}
