package algorithm.coding_230;


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

public class Solution {

    private List<Integer> list = new ArrayList<>();

    public int kthSmallest(TreeNode root, int k) {

        lmr(root, k);

        return list.get(k - 1);
    }

    public void lmr(TreeNode node, int k) {
        if (node == null) {
            return;
        }

        if (list.size() == k) {
            return;
        }

        lmr(node.left, k);
        list.add(node.val);
        lmr(node.right, k);
    }


}
