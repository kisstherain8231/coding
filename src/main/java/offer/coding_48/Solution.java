package offer.coding_48;

class Solution {

    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        char[] chars = s.toCharArray();
        int start = 0;

        for (int i = 0; i < chars.length; i++) {
            int innerStart = start;
            for (int k = innerStart; k < i; k++ ) {
                if (chars[k] == chars[i]) {
                    start = k+1;
                }
            }

            int len = i  - start + 1;
            if (max < len) {
                max = len;
            }
        }

        return max;
    }
}
