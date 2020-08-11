package algorithm.coding_394;

public class MainClass {

    public static void main(String[] args) {
        Solution solution =  new Solution();
        String s = "3[a]2[bc]";
        s = "3[a2[c]]";
        //s = "100[leetcode]";
        String result =  solution.decodeString(s);
        System.out.println(result);

       // Assert.assertArrayEquals("", );
    }

}
