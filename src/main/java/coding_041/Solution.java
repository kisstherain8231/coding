package coding_041;


public class Solution {
    public int firstMissingPositive(int[] nums) {

        for(int i = 0; i < nums.length; i++){
            while(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[nums[i] - 1]){
                // 必须先判断完nums[ i ] 的边界条件，否则会runtime error，原因是假如nums[ 1 ] == //8, 然而我们的数组只有5个元素，根本就不存在nums[ 8 - 1]
                swap(nums, i, nums[i] - 1);
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i+1 ) return i + 1;
        }
        return nums.length + 1;
    }
    public void swap(int[] n, int i, int j){
        int temp = n[i];
        n[i] = n[j];
        n[j] = temp;
    }
}
