package offer.coding_52;

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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set =  new HashSet<>();
        ListNode res = null;
        ListNode curA = headA;
        ListNode curB = headB;
        while (curA != null) {
            set.add(curA);
            curA = curA.next;
        }

        while (curB != null) {
            if (set.contains(curB)) {
                res = curB;
                break;
            }
            curB = curB.next;
        }


        return res;
    }
}
