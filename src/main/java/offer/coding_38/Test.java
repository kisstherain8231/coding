package offer.coding_38;

public class Test {


    @org.junit.Test
    public void  test() {
        Solution solution = new Solution();

        String [] res = solution.permutation("abc");

        for (String tmp : res) {
            System.out.println(tmp);
        }
    }

}
