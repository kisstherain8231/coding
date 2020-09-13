package offer.coding_62;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int lastRemaining(int n, int m) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(i);
        }

        int index = 0;
        while (list.size() != 1) {
            index = index + m - 1;
            if (index > list.size()) {
                index = index % list.size();
            } else {
                index = index;
            }

            list.remove(index );
        }

        return  list.get(0);
    }
}
