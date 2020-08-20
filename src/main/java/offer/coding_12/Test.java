package offer.coding_12;

public class Test {


    @org.junit.Test
    public void test() {
        char  [][]board = {{'a','b'},{'c','d'}};
         String word = "bd";

         Solution solution = new Solution();
         System.out.println(solution.exist(board, word));


    }

}
