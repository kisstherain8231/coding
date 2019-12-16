package coding_344;

public class Solution {

    public void reverseString(char[] s) {

        if (s == null) {
            return;
        }

        if (s.length == 0) {
            return;
        }

        int i = 0;
        int k = s.length -1;

        while (i <=k) {
            char tmp = s[i];
            s[i] = s[k];
            s[k] = tmp;
            i++;
            k--;
        }
    }
}
