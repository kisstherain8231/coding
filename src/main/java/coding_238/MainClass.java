package coding_238;

public class MainClass {


    public static void main(String[] args) {
        //[1,2,3,4]
        Solution solution = new Solution();
        int  [] input = {1,2,3,4};
        int [] result = solution.productExceptSelf(input);

        for (int i : result) {
            System.out.print(i  + ", ");
        }

    }

}
