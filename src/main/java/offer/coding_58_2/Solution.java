package offer.coding_58_2;

class Solution {
    public String reverseLeftWords(String s, int n) {
        String a = s.substring(0, n);
        String b = s.substring(n, s.length());

        StringBuilder res = new StringBuilder();
        res.append(b).append(a);

        return res.toString();
    }
}
