package coding_141;

import java.util.HashSet;
import java.util.Set;

class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution {

    public boolean hasCycle(ListNode head) {

        Set<ListNode> set = new HashSet<>();

        boolean result = false;
        ListNode current = head;
        while (current != null) {
            if (set.contains(current)) {
                return true;
            } else {
                set.add(current);
            }
            current = current.next;
        }


        return result;
    }
}
