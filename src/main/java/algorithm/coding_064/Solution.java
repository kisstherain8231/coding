package coding_064;

class Solution {

    public int minPathSum(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int dp[][] = new int[row][col];

        //[[1,3,1],[1,5,1],[4,2,1]]

        int min = 0;
        dp[0][0] = grid[0][0];
        for (int i = 1; i < col; i++) {
            dp[0][i] = dp[0][i - 1] + grid[0][i];
        }

        if (row == 1) {
            return dp[0][col - 1];
        }

        for (int i = 1; i < row; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }

        if (col == 1) {
            return dp[row - 1][0];
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {

                dp[i][j] = Math.min(dp[i - 1][j] + grid[i][j],
                    dp[i][j - 1] + grid[i][j]);

                min = dp[i][j];


            }
        }

        return min;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();

        int [] [] grid = {
            {1, 2},
            {1, 1}
        };

        int result = solution.minPathSum(grid);

        System.out.print(result);
    }
}
