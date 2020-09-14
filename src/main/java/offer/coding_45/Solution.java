package offer.coding_45;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Solution {
    public String minNumber(int[] nums) {
        List<String> list = new ArrayList<>();

        for (Integer tuple : nums) {
            list.add(tuple.toString());
        }

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String sb1 = new StringBuilder().append(o1).append(o2).toString();
                String sb2 = new StringBuilder().append(o2).append(o1).toString();

                return  sb1.compareTo(sb2);
            }
        });


        StringBuilder stringBuilder = new StringBuilder();
        for (String tuple : list) {
            stringBuilder.append(tuple);
        }

        return stringBuilder.toString();
    }
}
