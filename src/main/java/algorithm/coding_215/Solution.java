package algorithm.coding_215;

import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {

    public int findKthLargest(int[] nums, int k) {

        int result = 0;

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(
            new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1.intValue() - o2.intValue();
                }
            }
        );

        for (int e : nums) {
            priorityQueue.add(e);

            if (priorityQueue.size() > k) {
                priorityQueue.poll();
            }
        }

        result = priorityQueue.poll();

        return result;
    }
}
