package coding_283;

public class Solution {

    public void moveZeroes(int[] nums) {
        int zeroeCount = 0;
        int i = 0;
        while ((i < (nums.length - zeroeCount))) {
            if (nums[i] == 0) {
                zeroeCount++;
                doMove(nums, i, zeroeCount);
            }

            if (nums[i] != 0) {
                i++;
            }
        }
    }


    public void doMove(int[] nums, int index, int zeroeCount) {
        for (int i = index; i < nums.length - 1; i++) {
            int tmp = nums[i + 1];
            nums[i + 1] = nums[i];
            nums[i] = tmp;
        }
    }

}
