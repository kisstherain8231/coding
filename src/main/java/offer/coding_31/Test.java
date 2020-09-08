package offer.coding_31;

public class Test {

    @org.junit.Test
    public void  test() {
        //[1,2,3,4,5]
       // [4,5,3,2,1]
        int [] pushed = {1,2,3,4,5};
        int [] poped = {4,5,3,2,1};
        /*int [] pushed = {2, 1, 0};
        int [] poped = {1, 2, 0};*/
        Solution solution =  new Solution();
        boolean result =  solution.validateStackSequences(pushed, poped);
        System.out.println(result);

    }

}
