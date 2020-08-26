package offer.coding_16;

class Solution {
    public double myPow(double x, int n) {

        int abs = Math.abs(n);

        double res = x;

        for (int i = 2; i <= abs; i++) {
            res = res * x;
        }

        if (n  > 0) {
            return res;
        } else if (n == 0) {
            return 1;
        } else {
            return 1.0/res;
        }

    }
}
