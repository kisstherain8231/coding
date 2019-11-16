package coding_581;

public class MainClass {

    public static void main(String[] args) {
        Solution solution = new Solution();
        //int num [] = {2,6,4,8,10,9,15};
        //int num [] = {1,2,3,4};
        int num[] = {2,3,3,2,4};
        int result =  solution.findUnsortedSubarray(num);

        System.out.print(result);
    }

}
