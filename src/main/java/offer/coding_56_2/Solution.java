package offer.coding_56_2;

class Solution {

    public int singleNumber(int[] nums) {
        int size = 32;
        int[] counts = new int[size];

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            for (int k = 0; k < 32; k++) {
                counts[k] = counts[k] + (num & 1);
                num = num >>> 1;
            }
        }
        int res = 0;
        int m = 3;
        for (int i = 0; i < counts.length; i++) {
            counts[i] = counts[i] % m;
        }

        for (int i = 0; i < counts.length; i++) {
            res = res << 1;
            res = res | counts[31 - i];
        }

        return res;
    }
}
