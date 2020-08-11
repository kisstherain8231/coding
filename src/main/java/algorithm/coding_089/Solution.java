package coding_089;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> list = new ArrayList<>();

        if (n ==0) {
             list.add(1);

             return list;
        }
        //全部为0
        list.add(0);
        // all 1

        int len = 0;
        int one = 0;
        while (len < n ) {
            int orgOne = one;
            one = one >> len;
            one = one | 1;
            one = one << len;
            one = one | orgOne;
            len++;
        }

        list.add(one);

        for (int i = 0; i <  n; i++) {
            int initCode = product(i, n);

            List<Integer>  codeList = change(initCode, i, n);

            list.addAll(codeList);
        }



        return  list;
    }

    private List<Integer> change(int code, int i, int n) {
        List<Integer> list = new ArrayList<>();
        // left
        int k = i - 1;

        while (k >=0) {
            int oldCode = code;
            int shiftLen = n -1 -k;
            code = code >> shiftLen;
            code = code | 1;
            code = code << shiftLen;
            code = code | oldCode;
            list.add(code);

            k--;
        }


        // right

        k = n - 1;
        while (k > i) {
            int oldCode = code;
            int shiftLen = n -1 -k;
            code = code >> shiftLen;
            code = code | 1;
            code = code << shiftLen;
            code = code | oldCode;
            list.add(code);

            k--;
        }

        return list;
    }

    // i 位移的位数
    private int product(int i, int n) {
        int init = 0;

        init = init >> i;
        init = init | 1;

        init = init << i;


        return  init;
    }

}
