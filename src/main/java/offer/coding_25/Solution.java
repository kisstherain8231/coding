package offer.coding_25;

class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        ListNode cur1 = l1;
        ListNode cur2 = l2;
        ListNode head = null;
        ListNode cur = null;

        if (cur1.val < cur2.val) {
            head = new ListNode(cur1.val);
            cur1 = cur1.next;
        } else if (cur1.val > cur2.val) {
            head = new ListNode(cur2.val);
            cur2 = cur2.next;
        } else {
            head = new ListNode(cur1.val);
            cur1 = cur1.next;
        }
        cur = head;


        while (cur1 != null && cur2 != null) {
            if (cur1.val < cur2.val) {
                cur.next = new ListNode(cur1.val);
                cur = cur.next;
                cur1 = cur1.next;
            } else if (cur1.val > cur2.val) {
                cur.next = new ListNode(cur2.val);
                cur =cur.next;
                cur2 = cur2.next;
            } else {
                cur.next = new ListNode(cur1.val);
                cur = cur.next;
                cur1 = cur1.next;
            }
        }

        // 处理链表耗尽的情况
        if (cur1 == null && cur2 != null) {
            cur.next = cur2;
        }

        if (cur1 != null && cur2 == null) {
            cur.next = cur1;
        }

        if (cur1 == null && cur2 ==null) {
            cur.next = null;
        }


        return head;

    }
}
