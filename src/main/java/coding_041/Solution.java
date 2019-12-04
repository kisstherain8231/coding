package coding_041;

public class Solution {

    public int firstMissingPositive(int[] nums) {

        if (null == nums) {
            return 1;
        }

        if(nums.length == 0) {
            return 1;
        }

        if (nums.length == 1) {
            if (nums[0] <= 0 ) {
                return 1;
            } else if (nums[0]  == 1){
                return 2;
            } else {
                return 1;
            }
        }
        int max = nums[0];

        int min = nums[0];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }

            if (nums[i] > max) {
                max = nums[i];
            }
            sum = sum + nums[i];
        }

        int targetSum = ((max - min + 1) * (min + max)) / 2;

        if (max - min + 1 == nums.length) {
            if (min == 0) {
                return max + 1;
            } else {
                return 1;
            }
        } else {
            if (min < 0) {
                return targetSum - sum;
            } else if (min > 0) {
                if (min > 1) {
                    return 1;
                } else {
                    return targetSum - sum;
                }

            } else { // min == 0
                return targetSum - sum;
            }
        }

    }
}
