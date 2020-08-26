package offer.coding_18;

class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Solution {

    public ListNode deleteNode(ListNode head, int val) {
        if (head == null) {
            return head;
        }

        ListNode dummy = head;

        if (head.val == val) {
            head = head.next;

            return head;
        }

        ListNode pre = head;
        dummy = dummy.next;

        while (dummy != null) {
            if (dummy.val == val) {
                pre.next = dummy.next;
            }
            pre = dummy;
            dummy = dummy.next;
        }

        return head;
    }
}
