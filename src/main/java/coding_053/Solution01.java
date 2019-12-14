package coding_053;

import java.io.IOException;

public class Solution01 {
    public int maxSubArray(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }
        int max = nums[0];
        //List<Integer> list = new ArrayList<>();
        int subSum = nums[0];

        int subArrSum = nums[0];

        for (int i = 0; i < nums.length; i++) {
            int tmp = nums[i];

            if (tmp >= 0) {
                if (subArrSum >= 0) {
                    subArrSum = subArrSum + tmp;
                } else {
                    subArrSum = tmp;
                }
            } else {
                if (subArrSum >= 0) {
                    if (subArrSum + tmp >= 0) {
                        subArrSum = subSum + tmp;
                    } else {
                        subArrSum = tmp;
                    }

                } else {
                    //maxSubArrSum
                    subArrSum = tmp;
                }
            }

            if (max < subArrSum) {
                max = subArrSum;
            }

        }

        return max;
    }


    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return new int[0];
        }

        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }

    public static void main(String[] args) throws IOException {
       /* BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] nums = stringToIntegerArray(line);

            int ret = new Solution().maxSubArray(nums);

            String out = String.valueOf(ret);

            System.out.print(out);
        }*/
        String line = "[-2,1,-3,4,-1,2,1,-5,4]";
        //line = "[-2,1]";
        int[] nums = stringToIntegerArray(line);

        int ret = new Solution01().maxSubArray(nums);

        String out = String.valueOf(ret);

        System.out.print(out);
    }
}
