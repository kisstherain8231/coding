package coding_283;

import org.junit.Test;

public class SolutionTest {


    @Test
    public void test() {

        Solution solution = new Solution();
        int nums []  = {0, 0 , 1};
        solution.moveZeroes(nums);

        for (int e : nums) {
            System.out.print(e + "  ");
        }

    }

}
