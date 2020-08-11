package algorithm.coding_347;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (Integer e : nums) {
            if (map.containsKey(e)) {
                Integer count = map.get(e);
                count++;
                map.put(e, count);
            } else {
                map.put(e, 1);
            }
        }



        // init heap 'the less frequent element first'
        PriorityQueue<Integer> heap =
            new PriorityQueue<Integer>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1.intValue() - o2.intValue();
                }
            });

        // keep k top frequent elements in the heap
        for (int n: map.keySet()) {
            heap.add(n);
            if (heap.size() > k)
                heap.poll();
        }


        // build output list
        List<Integer> top_k = new LinkedList();
        while (!heap.isEmpty())
            top_k.add(heap.poll());
        Collections.reverse(top_k);

        return top_k;
    }
}
