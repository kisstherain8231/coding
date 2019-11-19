package coding_739;

public class MainClass {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int [] T = {73,74,75,71,69,72,76,73};
        int [] result =  solution.dailyTemperatures(T);

        for (int i : result) {
            System.out.print(i + ", ");
        }

        //[1,1,4,2,1,1,0,0]
    }

}
