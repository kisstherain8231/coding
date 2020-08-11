package coding_079;

public class Solution {

    public boolean exist(char[][] board, String word) {
        int rowSize = board.length;
        int colSize = board[0].length;
        boolean[][] used = new boolean[rowSize][colSize];

        for (int r = 0; r < used.length; r++) {
            for (int c = 0; c < used[r].length; c++) {
                if (dfs(board, used, word, 0, r, c)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean dfs(char[][] board, boolean[][] used, String word, int pos, int row, int col) {
        if (row < 0 || row >= board.length
            || col < 0 || col >= board[0].length
            || pos >= word.length()
            || board[row][col] != word.charAt(pos)
            || used[row][col]) {
            return false;
        }
        if (pos == word.length() - 1) {
            return true;
        }

        used[row][col] = true;
        boolean res = dfs(board, used, word, pos + 1, row, col - 1)
            || dfs(board, used, word, pos + 1, row, col + 1)
            || dfs(board, used, word, pos + 1, row + 1, col)
            || dfs(board, used, word, pos + 1, row - 1, col);
        used[row][col] = false;

        return res;
    }

}
