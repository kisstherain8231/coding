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
        result.add(new ArrayList());

        Map<Integer, List<List<Integer>>> resutMap = new HashMap<>();

        for (int i = 1; i <= len; i++) {
            List<List<Integer>> currentList = new ArrayList<>();
            List<List<Integer>> preList = resutMap.get(i - 1);
            resutMap.put(i, currentList);

            for (int k = 0; k < len; k++) {
                if (preList != null) {
                    for (List<Integer> tmpPreList : preList) {
                        Set<Integer> set = new HashSet<>(tmpPreList);
                        if (!set.contains(nums[k])) {
                            int max = tmpPreList.get(tmpPreList.size() - 1);
                            if (max < nums[k]) {
                                List<Integer> tmpList = new ArrayList<>();
                                tmpList.addAll(tmpPreList);
                                tmpList.add(nums[k]);
                                currentList.add(tmpList);
                            }
                        }
                    }
                } else { //对一次添加元素
                    List<Integer> tmpList = new ArrayList<>();
                    tmpList.add(nums[k]);
                    currentList.add(tmpList);
                }
            }
        }

        for (List<List<Integer>> list : resutMap.values()) {

           result.addAll(list);
        }

        return result;

    }
}
