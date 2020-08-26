package offer.coding_17;

class Solution {
    public int[] printNumbers(int n) {
        int max = 0;
        for (int i = 1; i <= n; i++) {
            max = max + 9 *  (10^ (n - 1));
        }
        int [] res = new int[max];

        for (int i = 1; i <= max; i++) {
            res[i-1] = max;
        }

        return res;

    }
}
