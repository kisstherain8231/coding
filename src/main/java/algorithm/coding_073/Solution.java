package coding_073;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public void setZeroes(int[][] matrix) {

        Set<Integer> rowSet = new HashSet<>();

        Set<Integer> colSet = new HashSet<>();

        for (int r = 0; r < matrix.length; r++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (matrix[r][col] == 0) {
                    rowSet.add(r);
                    colSet.add(col);
                }
            }
        }


        for (int r = 0; r < matrix.length; r++) {
            for (int col = 0; col < matrix[0].length; col++) {

                if (rowSet.contains(r) || colSet.contains(col)) {
                    matrix[r][col] = 0;
                }

            }
        }

    }
}
