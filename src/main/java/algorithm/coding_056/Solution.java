package coding_056;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public int[][] merge(int[][] intervals) {

        if (null == intervals) {
            return intervals;
        }

        if (intervals.length == 0) {
            return intervals;
        }

        if (intervals[0] == null) {
            return intervals;
        }

        //默认是排序的
        List<int[][]> list = new ArrayList<int[][]>();

        int[][] tmp = new int[1][1];

        tmp[0] = intervals[0];

        list.add(tmp);

        for (int r = 1; r < intervals.length; r++) {
            if (intervals[r][0] < intervals[r - 1][1]) {
                if (intervals[r][1] < intervals[r - 1][1]) {
                    // 维持不变
                } else if (intervals[r][1] > intervals[r - 1][1]) {
                    //intervals[r -1][1] = intervals[r][1];
                    int[][] interval = list.get(list.size() - 1);
                    interval[0][1] = intervals[r][1];
                } else {
                    // 维持不变
                }
            } else if (intervals[r][0] == intervals[r - 1][1]) {
                //intervals[r -1][1] = intervals[r][1];

                int[][] interval = list.get(list.size() - 1);
                interval[0][1] = intervals[r][1];
            } else {
                int[][] tmpArr = new int[1][1];
                tmpArr[0] = intervals[r];
                list.add(tmpArr);
            }
        }

        int size = list.size();

        int[][] result = new int[size][2];

        for (int i = 0; i < size; i++) {
            result[i][0] = list.get(i)[0][0];
            result[i][1] = list.get(i)[0][1];
        }

        return result;
    }
}
