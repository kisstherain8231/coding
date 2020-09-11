package offer.coding_38;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public String[] permutation(String s) {
        Set<String> set = new HashSet<>();
        doPermutaion( new StringBuilder(),new StringBuilder(s), set);

        int size = set.size();
        String [] res = new String[size];

        int i = 0;
        for (String tuple : set) {
            res[i]  = tuple;
            i++;
        }

        return res;
    }

    public void doPermutaion( StringBuilder product, StringBuilder remains, Set<String> set){
        if (remains.length() == 0) {
            set.add(product.toString());

            return;
        }

        for (int i = 0; i < remains.length(); i++) {
            StringBuilder remainCpy = new StringBuilder(remains.toString());
            StringBuilder productCpy = new StringBuilder(product.toString());
            char tmp = remainCpy.charAt(i);

            productCpy.append(tmp);
            remainCpy.deleteCharAt(i);

            doPermutaion(productCpy, remainCpy, set);
        }
    }
}
