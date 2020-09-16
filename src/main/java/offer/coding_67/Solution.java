package offer.coding_67;

class Solution {

    public int strToInt(String str) {
        char[] chars = str.trim().toCharArray();
        int res = 0;

        if (chars.length == 0) {

            return 0;
        }

        int boundary = Integer.MAX_VALUE / 10;
        int sign = 1;
        int start = 0;

        if (chars[0] == '-') {
            sign = -1;
            start = 1;
        }

        if (chars[0] == '+') {
            sign = 1;
            start = 1;
        }

        for (int i = start; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9') {

                break;
            }

            if (res > boundary || (res == boundary && chars[i] > '7')) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            res = res * 10 + (chars[i] - '0');
        }

        return res * sign;
    }
}
