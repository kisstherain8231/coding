package coding_234;


class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Solution {

    public boolean isPalindrome(ListNode head) {
        int size = 0;
        ListNode node = head;
        while (node != null) {
            size++;
            node = node.next;
        }
        int fisrt = 0;
        int second = 0;

        if (size % 2 == 0) {
            fisrt = size / 2 - 1;
            second = size / 2 ;
        } else {
            fisrt = size/ 2 -1 ;
            second = size/2 + 1;
        }

        // 前面
        ListNode secondNode = head;
        ListNode firstdNode = head;
        int index = 0;

        while (firstdNode != null && index == fisrt) {
            ListNode tmp = firstdNode;

        }

        index = 0;
        while (secondNode != null && index == second) {

            secondNode = secondNode.next;

            index++;
        }










        return true;
    }
}
