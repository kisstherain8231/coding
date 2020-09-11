package offer.coding_40;

public class Test {


    @org.junit.Test
    public void test() {
        Solution solution = new Solution();
        int [] input = {3,2,1};
        int [] res = solution.getLeastNumbers(input, 2);

        for (int tuple : res) {
            System.out.println(tuple);
        }
    }

}
