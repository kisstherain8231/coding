package offer.coding_44;


class Solution {
    public int findNthDigit(int n) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i <= n; i++) {
            stringBuilder.append(i);
        }

        char tmp = stringBuilder.charAt(n);

        return tmp - '0';
    }
}
