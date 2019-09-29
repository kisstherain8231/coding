package coding_46;

import java.util.ArrayList;
import java.util.List;

class Solution_1 {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        List<Integer> first = new ArrayList<>();
        first.add(nums[0]);
        res.add(first);     //res.add(new ArrayList<>(nums[0]));//不能这样写
        List<List<Integer>> newRes;
        for (int i = 1; i < nums.length; i++) {
            newRes = new ArrayList<>();
            for (List<Integer> item : res) {
                for (int j = 0; j <= item.size(); j++) { //注意这里是<= 有这么多个位置可以插入
                    List<Integer> temp = new ArrayList<>(item);
                    temp.add(j, nums[i]); //在j位置放入nums[i]
                    newRes.add(temp);
                }
            }
            res = newRes;
        }
        return res;
    }
}

