package offer.coding_43;

class Solution_01 {
    public int countDigitOne(int n) {
        int count = 0;
        for (int i = 1; i <=n; i++) {
            count = count + countOne(i);
        }

        return count;
    }

    public int countOne(int number) {
        int oneCount = 0;
        int watch = number;
        while (number != 0) {
            int tmp = number;
            number = number / 10;
            int diff = tmp - number * 10;
            if (diff == 1) {
                oneCount++;
            }
        }

        return oneCount;
    }
}
