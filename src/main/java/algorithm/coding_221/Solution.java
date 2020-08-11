package algorithm.coding_221;

public class Solution {

    public int maximalSquare(char[][] matrix) {
        int max = 0;

        int row = matrix.length;

        if (row == 0) {
            return 0;
        }

        int col = matrix[0].length;
        // 长度
        int[][] dp = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int k = 0; k < col; k++) {
                if (matrix[i][k] == '1') {
                    dp[i][k] = 1;
                    if (dp[i][k] > max) {
                        max = dp[i][k];
                    }
                }
            }
        }

        for (int i = 1; i < row; i++) {
            for (int k = 1; k < col; k++) {
                if (matrix[i][k] == '1') {
                    if (dp[i - 1][k - 1] > 0) {
                        // 查看增加的行和列是否为0
                        if (isZero(matrix, i, k, dp[i - 1][k - 1])) {
                            dp[i][k] = dp[i - 1][k - 1] + 1;
                        } else { // 查找当前点的最大值
                            dp[i][k] =  oneLen(matrix, i, k, dp[i - 1][k - 1]) + 1;
                        }

                        if (dp[i][k] > max) {
                            max = dp[i][k];
                        }
                    }
                }
            }
        }

        return max * max;

    }

    // check all 1
    boolean isZero(char[][] matrix, int i, int k, int len) {
        boolean result = true;
        // 某一列
        for (int m = 1; m <= len; m++) {
            if (matrix[i - m][k] == '0') {
                return false;
            }
        }

        // 某一行
        for (int m = 1; m <= len; m++) {
            if (matrix[i][k - m] == '0') {
                return false;
            }
        }

        return result;
    }

    // check all 1
    int oneLen(char[][] matrix, int i, int k, int len) {
        int rowLen = 0;
        int colLen = 0;
        int result = 0;
        // 某一列
        for (int m = 1; m <= len; m++) {
            if (matrix[i - m][k] == '0') {
                break;
            } else {
                rowLen++;
            }
        }

        // 某一行
        for (int m = 1; m <= len; m++) {
            if (matrix[i][k - m] == '0') {
                break;
            } else {
                colLen++;
            }
        }

        return Math.min(colLen, rowLen);
    }
}
