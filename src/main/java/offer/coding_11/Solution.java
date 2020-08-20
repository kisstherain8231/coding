package offer.coding_11;

class Solution {
    public int minArray(int[] numbers) {

        if (numbers.length == 1) {
            return numbers[0];
        }

        int reslut = numbers[0];
        for (int i = 0; i < numbers.length - 1; i++) {
            // 递增
            if (numbers[i+1] >= numbers[i]) {
                continue;
            } else {  //值开始减小
                reslut =  numbers[i];
                break;
            }
        }

        return reslut;
    }
}
