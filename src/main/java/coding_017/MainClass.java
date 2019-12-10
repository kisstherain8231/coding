package coding_017;

import java.util.List;
import org.junit.Test;

public class MainClass {


    @Test
    public void test() {

        Solution solution = new Solution();
        String digits = "23";
        List<String> list = solution.letterCombinations(digits);

        System.out.println(list);
    }

}
