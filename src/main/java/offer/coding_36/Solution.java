package offer.coding_36;

import java.util.ArrayList;
import java.util.List;

class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};

public class Solution {
    //List<Node> list = new ArrayList<>();
    public Node treeToDoublyList(Node root) {
        if (null == root) {

            return  null;
        }
        List<Node> list = new ArrayList<>();
        visit(root, list);

        oganize(list);

        return list.get(0);
    }

    public void oganize(List<Node> nodeList) {
        int size = nodeList.size();

        for (int i = 0; i < size - 1; i++) {
            Node node = nodeList.get(i);

            node.right = nodeList.get((i + 1));
        }

        for (int i = size - 1; i > 0; i--) {
            Node node = nodeList.get(i);
            int pre = i  - 1;
            node.left = nodeList.get(pre);
        }

        Node first = nodeList.get(0);
        Node last = nodeList.get(size - 1);

        first.left = last;
        last.right = first;
    }

    public void visit(Node node, List<Node> list) {
        if (node == null) {
            return ;
        }
        visit(node.left, list);
        // node.val
        list.add(node);
        visit(node.right, list);
    }
}
