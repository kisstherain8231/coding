package coding_054;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        if (matrix == null) {
            return result;
        }

        if (matrix.length == 0) {
            return result;
        }


        int row = matrix.length;
        int col = matrix[0].length;

        int [][] flag = new int[row][col];
        int count = row * col;

        int visited = 0;
        int m = 0;
        int n = 0;
        // 1, 2, 3, 4
        int direct = 1;  //right

        result.add(matrix[m][n]);
        flag[m][n] = 1;

        while (result.size() != count) {

            if (direct == 1) {
                if (n == col  - 1) {
                    direct = 2;
                } else if (n < col -1) {
                    if (flag[m][n + 1] == 0) {
                        n  = n + 1;
                        flag[m][n] = 1;
                        result.add(matrix[m][n]);
                    } else if (flag[m][n + 1] == 1) {
                        direct = 2;
                    }
                }
            } else if (direct == 2) {
               if (m == row - 1) {
                   // left
                   direct = 3;
               } else if (m < row - 1){
                   if (flag[m+1][n] == 1) {
                       direct = 3;
                   } else {
                       m++;
                       flag[m][n] = 1;
                       result.add(matrix[m][n]);
                   }
               }

            } else if (direct == 3) { // left
                if (n == 0) {
                    direct = 4;
                } else if (n > 0) {
                   if (flag[m][n -1] == 0) {
                       n--;
                       flag[m][n] = 1;
                       result.add(matrix[m][n]);
                   } else {
                       direct = 4;
                   }
                }

            } else if (direct == 4) {
                if (m == 0) {
                    direct = 1;
                } else if (m > 0) {
                    if (flag[m -1][n] == 0) {
                        m--;
                        flag[m][n] = 1;
                        result.add(matrix[m][n]);
                    } else {
                        direct = 1;
                    }
                }
            }
        }

        return result;
    }
}
