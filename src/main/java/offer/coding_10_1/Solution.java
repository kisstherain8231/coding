package offer.coding_10_1;

/**
 *
 * F(0) = 0,   F(1) = 1
 * F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
 */

class Solution {
    public int fib(int n) {
        //1000000007
        return iterator(n) % 1000000007;
    }

    int iterator(int n) {
        int i = 0;
        int fn = 0;
        int fn_1 = 0;
        int fn_2 = 0;
        while (i <= n) {
            if (i == 0) {
                fn_2 = 0;
                fn = 0;
            } else if (i == 1) {
                fn_1 = 1;
                fn = 1;
            } else {
                fn = fn_1 + fn_2;
                fn_2 = fn_1;
                fn_1 = fn;

            }
            i++;
        }

        return fn;
    }
}
