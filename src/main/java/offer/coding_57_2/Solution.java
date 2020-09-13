package offer.coding_57_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Solution {
    public int[][] findContinuousSequence(int target) {
        List<List> lists = doFind(target);

        Iterator<List> iterator = lists.iterator();
        while (iterator.hasNext()) {
            List<Integer> list = iterator.next();

            if (list.size() < 2) {
                iterator.remove();
            }
        }

        int size = lists.size();
        int [][] res = new int[size][];

        int index = 0;
        for (List<Integer> list : lists) {
            int len = list.size();
            int [] row = new int[len];

            for (int k = 0; k < list.size(); k++) {
                row[k] = list.get(k);
            }

            res[index] = row;
            index++;
        }

        return res;
    }

    public List<List> doFind(int target) {
        List<List> lists = new ArrayList<>();

        for (int i = 1; i <= target; i++) {
            List<Integer> list = new ArrayList<>();
            int sum = 0;
            int add = i;
            while (true && add <= target) {
                list.add(add);
                sum = sum + add;
                if (sum == target){
                    lists.add(list);
                    break;
                } else if (sum > target) {
                    break;
                }
                add++;
            }
        }

        return lists;
    }
}
