package offer.coding_56_1;

class Solution {
    public int[] singleNumbers(int[] nums) {
        int ret = 0;

        for (int tuple : nums) {
            ret = ret ^ tuple;
        }

        int div = 1;
        // find the value contains only one 1

        while ( (div & ret) == 0) {
            div = div << 1;
        }
        int a = 0;
        int b = 0;
        for (int tuple : nums) {
            if ((tuple & div) == 0) {
                a = a ^ tuple;
            } else {
                b = b ^ tuple;
            }
        }
        int [] res = {a, b};

        return res;
    }
}
