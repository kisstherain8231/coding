package coding_054;

import java.util.List;
import org.junit.Test;

public class MainClass {


    @Test
    public void test() {
        Solution solution = new Solution();
        int matrix [][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8,9}
        };
        List<Integer> result =  solution.spiralOrder(matrix);

        System.out.println(result);
    }

}
