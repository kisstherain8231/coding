package coding_089;

import java.util.List;
import org.junit.Test;

public class MainClass {


    @Test
    public void  test() {
        Solution solution = new Solution();

        List<Integer> list = solution.grayCode(2);

        System.out.println(list);
    }

}
