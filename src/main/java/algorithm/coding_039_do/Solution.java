package coding_039_do;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new LinkedList<>();//返回的列表
        List<Integer> temp = new LinkedList<>();//临时列表
        //首先进行排序，避免重复搜索
        Arrays.sort(candidates);//排序
        combin(candidates, target, 0, temp, result);
        //返回列表
        return result;

    }

    private void combin(int[] arrays, int target, int index, List<Integer> temp,
        List<List<Integer>> result) {
        if (target < 0) {
            return;
        } else if (target == 0) {
            result.add(new LinkedList<>(temp));
        } else {
            for (int i = index; i < arrays.length; i++) {
                temp.add(arrays[i]);
                combin(arrays, target - arrays[i], i, temp, result);


            }
        }

    }

}
