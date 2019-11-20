package coding_221;

public class MainClass {

    public static void main(String[] args) {
        Solution solution = new Solution();

        String [][] matrixStr =
            {{"0","0","0","1"},{"1","1","0","1"},{"1","1","1","1"},{"0","1","1","1"},{"0","1","1","1"}};

        int row = matrixStr.length;
        int col = matrixStr[0].length;
        char [] [] matrix = new char[row][col];

        for (int i = 0; i < row; i++) {
            for (int k = 0; k < col; k++) {
                matrix[i][k] = matrixStr[i][k].charAt(0);
            }
        }

       int result =  solution.maximalSquare(matrix);
       System.out.println(result);
    }

}
