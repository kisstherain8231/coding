package coding_042;

import org.junit.Test;

public class MainClass {





    @Test
    public void test() {

        Solution solution = new Solution();


        int [] height = {2,0, 2};
        int result =  solution.trap(height);

        System.out.println(result);
    }

}
