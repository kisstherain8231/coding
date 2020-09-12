package offer.coding_54;

import java.util.ArrayList;
import java.util.List;

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {

    public int kthLargest(TreeNode root, int k) {
        List<TreeNode> list =  new ArrayList<>();

        midVisit(root, list);
        int size = list.size();
        TreeNode node =  list.get(size - 1 - (k - 1) );

        return node.val;
    }

    void midVisit(TreeNode node, List<TreeNode> list) {
        if (node == null) {
            return;
        }

        midVisit(node.left, list);
        list.add(node);
        midVisit(node.right, list);
    }
}
