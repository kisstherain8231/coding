package coding_581;

public class Solution {
    public int findUnsortedSubarray(int[] nums) {

        int dp [] = new int[nums.length];
        int max = nums[0];

        int startIndex = 0;
        int endIndex = 0;

        int startSame = 0;
        int endSame = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {  // normal
                max = nums[i];
            } else if (nums[i] == max) {
                startSame ++;
            } else {  //第一次乱序
                startIndex = i;
                break;
            }
        }
        int min = nums[nums.length - 1];
        for (int i = nums.length -1; i >= 0; i--) {
            // 非升序的序列
            if (nums[i] < min) {
                min = nums[i];
            } else if (nums[i] == min){

            } else { //第一次乱序
                endIndex = i;
                break;
            }
        }
        int result = endIndex - startIndex + 1;
        //处理末尾
        if (startIndex != endIndex) {
            //
            if (startIndex != 0) {
                for (int i  = startIndex; i > 0; i--) {

                }
            }


        }


        return endIndex  - startIndex  + 1;


    }
}
