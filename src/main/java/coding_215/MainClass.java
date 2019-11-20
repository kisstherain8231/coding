package coding_215;

public class MainClass {

    public static void main(String[] args) {
        Solution solution = new Solution();

        //[3,2,1,5,6,4]
        int nums [] = {3,2,1,5,6,4};
        int result =  solution.findKthLargest(nums, 2);

        System.out.println(result);


    }

}
