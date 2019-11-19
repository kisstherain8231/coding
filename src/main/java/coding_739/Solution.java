package coding_739;

class Solution {

    public int[] dailyTemperatures(int[] T) {
        int[] result = new int[T.length];

        for (int i = 0; i < T.length - 1; i++) {
            for (int k = i + 1; k < T.length; k++) {
                result[i]++;
                if (T[k] > T[i]) {

                    break;
                } else {
                    // 如果一直小
                    if (k == T.length - 1) {
                        result[i] = 0;
                    }
                }
            }

        }

        result[T.length - 1] = 0;

        return result;
    }
}
