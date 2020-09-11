package offer.coding_40;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {

        List<Integer> list = new ArrayList<>();
        for (int tuple : arr) {
            list.add(tuple);
        }

        Collections.sort(list);

        List<Integer> subList = list.subList(0, k);
        int [] res = new int[k];

        int i = 0;
        for (int tuple : subList) {
            res[i] = tuple;
            i++;
        }

        return res;
    }
}
