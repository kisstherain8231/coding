package coding_078;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Solution {

    public List<List<Integer>> subsets(int[] nums) {
        int len = nums.length;

        List<List<Integer>> result = new ArrayList<>();

        Map<Integer, List<Set<Integer>>> map = new HashMap<>();

        for (int i = 1; i <= len; i++) {
            List<Set<Integer>> currentList = new ArrayList<>();
            List<Set<Integer>> preList = map.get(i - 1);
            map.put(i, currentList);

            for (int k = 0; k < len; k++) {
                if (preList != null) {
                    for (Set<Integer> tmpPreSet : preList) {
                        if (!tmpPreSet.contains(nums[k])) {
                            Set<Integer> currentSet = new HashSet<>();
                            currentSet.addAll(tmpPreSet);
                            currentSet.add(nums[k]);
                            currentList.add(currentSet);
                        }
                    }
                } else { //对一次添加元素
                    Set<Integer> currentSet = new HashSet<>();
                    currentSet.add(nums[k]);
                    currentList.add(currentSet);
                }

            }
        }

        for (List<Set<Integer>> list : map.values()) {

            for (Set<Integer> set : list) {
                List<Integer> tmpList = new ArrayList<>();
                tmpList.addAll(set);
                result.add(tmpList);
            }
        }


        return result;

    }
}
