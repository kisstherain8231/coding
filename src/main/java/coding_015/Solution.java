package coding_015;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();
        int len  = nums.length;
        int [][] [] matrix = new int[len][len] [len];
        Set<String> set =new HashSet<>();

        for (int i = 0; i < len; i++){
            for (int j = 0; j < len; j++) {
                for (int k = 0; k < len; k++) {
                    if (i ==j || i==k || j == k) {
                        continue;
                    }else {
                        int tmp = nums[i] + nums[j] + nums[k];

                        if (tmp == 0) {

                            StringBuilder stringBuilder = new StringBuilder();

                            List<Integer> tmpList = new ArrayList<>();
                            tmpList.add(nums[i]);
                            tmpList.add(nums[j]);
                            tmpList.add(nums[k]);

                            Collections.sort(tmpList);

                            stringBuilder.append(tmpList.get(0));
                            stringBuilder.append(tmpList.get(1));
                            stringBuilder.append(tmpList.get(2));

                            if (set.contains(stringBuilder.toString())) {
                                continue;
                            } else {
                                set.add(stringBuilder.toString());
                                list.add(tmpList);
                            }

                        }
                    }
                }
            }
        }



        return list;
    }
}
