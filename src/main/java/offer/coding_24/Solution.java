package offer.coding_24;

class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode cur = head.next;
        ListNode pre = head;
        pre.next = null;
        while (cur!= null) {
            ListNode tmp = cur.next;
            cur.next = pre;

            // move forward
            pre = cur;
            cur = tmp;
        }

        return  pre;
    }
}
