package offer.coding_59_2;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

class MaxQueue {

    Queue<Integer> queue = new LinkedList<>();

    ArrayDeque<Integer> maxQueue = new ArrayDeque<>();

    public MaxQueue() {

    }

    public int max_value() {
        if (!maxQueue.isEmpty()) {
            return maxQueue.peek();
        } else {
            return -1;
        }
    }

    public void push_back(int value) {
        if (queue.isEmpty()) {
            maxQueue.addLast(value);
        } else {
            while ((!maxQueue.isEmpty())
                && maxQueue.peekLast() < value) {
                maxQueue.pollLast();
            }

            maxQueue.addLast(value);
        }
        queue.offer(value);
    }

    public int pop_front() {

        if (queue.isEmpty()) {
            return -1;
        } else {
            int front = queue.poll();
            if (front == maxQueue.peekFirst().intValue()) {
                maxQueue.pollFirst();
            }

            return front;
        }
    }
}
