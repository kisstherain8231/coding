package offer.coding_13;

class Solution {

    private int count = 0;

    public int movingCount(int m, int n, int k) {
        int bitMap[][] = new int[m][n];
        dfsCount(m, n, 0, 0, k, bitMap);

        return count;
    }


    public void dfsCount(int M, int N, int m, int n, int k, int bitMap[][]) {

        if (n >= N || m >= M
            || n < 0 || m < 0 || bitMap[m][n] == 1) {

            return;
        }

        int mVal = calSum(m);
        int nVal = calSum(n);

        if (mVal + nVal <= k) {
            count++;
        } else {
            return;
        }
        bitMap[m][n] = 1;
        dfsCount(M, N, m - 1, n, k, bitMap);
        dfsCount(M, N, m + 1, n, k, bitMap);
        dfsCount(M, N, m, n-1, k, bitMap);
        dfsCount(M, N, m, n+1, k, bitMap);

        return;
    }

    int calSum(int x) {

        String str = new StringBuilder().append(x).toString();
        int result = 0;

        char arr[] = str.toCharArray();

        for (char c : arr) {
            result = result + c - '0';
        }

        return result;
    }

}
