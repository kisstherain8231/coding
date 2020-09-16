package offer.coding_16;

/**
 * if(x == 0) return 0; long b = n; double res = 1.0; if(b < 0) { x = 1 / x; b = -b; } while(b > 0)
 * { if((b & 1) == 1) res *= x; x *= x; b >>= 1; } return res; }
 */
class Solution {

    public double myPow(double x, int n) {
        double res = 1.0;

        if (x == 0) {
            return 0;
        }

        long b = n;
        if (b < 0) {
            x = 1 / x;
            b = -b;
        }

        while (b > 0) {
            if ((b & 1) == 1) {
                res = res * x;
            }

            x = x * x;
            b = b >> 1;
        }

        return res;
    }
}
