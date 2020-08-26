package offer.coding_22;

class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {

    public ListNode getKthFromEnd(ListNode head, int k) {
        int count = 1;
        ListNode dummy = head;
        while (dummy != null) {
            dummy = dummy.next;
            count++;
        }

        dummy = head;
        int index = count - k;
        int count1= 1;
        while (count1 <= index) {
            dummy = dummy.next;
            count1++;
        }

        return dummy;
    }
}
