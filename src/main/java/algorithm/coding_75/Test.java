package coding_75;

public class Test {


    @org.junit.Test
    public void test() {
        int  [] arg  = {2,0,2,1,1,0};
        Solution solution = new Solution();

        solution.sortColors(arg);

        //System.out.print(arg);

        for (int tmp : arg) {
            System.out.print(tmp +  ",");
        }
    }

}
