package offer.coding_47;

class Solution {
    public int maxValue(int[][] grid) {
        int yMax = grid.length;
        int xMax = grid[0].length;

        int [][] dp = new int[yMax][xMax];
        dp[0][0] = grid[0][0];

        for (int x = 0; x < xMax; x++) {
            for (int y = 0; y < yMax; y++) {
                if (x == 0 && y == 0) {
                    dp[0][0] = grid[0][0];
                }
                else if (y == 0 && x != 0) {
                    dp[y][x] = dp[y][x -1] + grid[y][x];
                }
                else if (x == 0 && y != 0) {
                    dp[y][x] = dp[y-1][x] + grid[y][x];
                }
                else {
                    int down = dp[y -1][x] + grid[y][x];
                    int right = dp[y][x - 1] + grid[y][x];

                    if (down > right) {
                        dp[y][x] = down;
                    } else {
                        dp[y][x] = right;
                    }
                }
            }
        }

        return dp[yMax -1][xMax-1];
    }
}
