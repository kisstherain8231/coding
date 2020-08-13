package offer.coding_04;

import java.util.Stack;

class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {

    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack();

        ListNode current = head;
        while (current != null) {
            stack.push(current.val);
            current = current.next;
        }

        int [] result = new int[stack.size()];
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            result[i] = stack.pop();
        }

        return result;
    }
}
