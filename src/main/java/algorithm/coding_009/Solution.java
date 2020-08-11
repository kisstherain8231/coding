package coding_009;

public class Solution {
    public boolean isPalindrome(int x) {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(x);

        int len = stringBuilder.length();
        int left = 0;
        int right = len - 1;
        while (left <= right) {
            char leftChar = stringBuilder.charAt(left);
            char rightChar = stringBuilder.charAt(right);

            if (leftChar != rightChar) {
                return false;
            }

            left++;
            right--;

        }

        return  true;
    }
}
