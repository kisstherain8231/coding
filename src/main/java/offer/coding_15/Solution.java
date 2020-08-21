package offer.coding_15;

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;

        int flag = 0x0001;
        int tmp = 0;
        int val = n;
        while (val != 0) {
            tmp = val & flag;
            if (tmp == 1) {
                count++;
            }

            val = val >> 1;
        }

        return count;
    }
}
