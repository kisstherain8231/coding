package coding_039;

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
        //如果目标和的差值小于0，表示该路径出现错误
        if (target < 0) {
            return;
            //等于表示，这是一条正确的路径，将其add到result上
        } else if (target == 0) {
            //这里每次重新创建temp列表，避免与之前的列表重复
            result.add(new LinkedList<>(temp));
            //否则的话，目标和的差值大于0，继续进行深度优先搜索
        } else {
            //选取之后的每个数字都是一种可能性，其中index的作用是避免搜索之前搜索过的数组元素
            for (int i = index; i < arrays.length; i++) {
                temp.add(arrays[i]);
                //先加入元素，然后进行搜索，这里进行DFS搜索，如果不满足，就把temp列表里的元素去除掉
                combin(arrays, target - arrays[i], i, temp, result);
                //目标和不符合，所以将临时列表的最新值去除，然后尝试下一个元素
                temp.remove(temp.size() - 1);
            }
        }
    }

}
