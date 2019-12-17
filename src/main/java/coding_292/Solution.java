package coding_292;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private List<Integer> list = new ArrayList<>();

    public boolean canWinNim(int n) {
        cal(n, 0);

        boolean result = false;
        for (Integer e : list) {
            if (e % 2 == 0) {
                result = false;

                break;
            } else {
                result = true;
            }
        }

        return result;
    }


    public void cal(int n, int count) {
        if (n < 0) {

            return;
        }

        if (n == 0) {
            list.add(count);
        }

        if (n > 0) {
            cal(n -1, count + 1 );
            cal(n -2, count + 1 );
            cal(n -3, count + 1 );
        }
    }
}
