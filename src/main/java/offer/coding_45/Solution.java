package offer.coding_45;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Data{
   int num;
   int high;
}

class Solution {
    public String minNumber(int[] nums) {
        List<Data> list = new ArrayList<>();

        for (Integer tuple : nums) {
            Data data = new Data();
            data.num = tuple;
            StringBuilder stringBuilder = new StringBuilder(tuple.toString());
            char high = stringBuilder.charAt(0);
            data.high = high - '0';
            list.add(data);
        }
        Collections.sort(list, new Comparator<Data>() {
            @Override
            public int compare(Data o1, Data o2) {
                int compare = 0;
                if (o1.high > o2.high) {
                    compare =  1;
                } else if (o1.high == o2.high) {
                    compare =  0;
                } else {
                    compare =  -1;
                }

                return compare;
            }
        });

        // find not zero
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            index = i;
            if ( 0 != list.get(i).high) {
                break;
            }
        }

        Data tmp = list.get(0);
        list.set(0, list.get(index));
        list.set(index, tmp);

        StringBuilder stringBuilder = new StringBuilder();
        for (Data tuple : list) {
            stringBuilder.append(tuple.num);
        }

        return stringBuilder.toString();
    }
}
