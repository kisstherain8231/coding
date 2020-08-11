package algorithm.coding_230;


public class Solution01 {

    private int count = 0;

    private int val = 0;

    public int kthSmallest(TreeNode root, int k) {

        lmr(root, k);

        return val;
    }

    public void lmr(TreeNode node, int k) {
        if (node == null) {
            return;
        }

        lmr(node.left, k);
        count++;
        if (count == k) {
            val = node.val;

            return;
        }
        lmr(node.right, k);
    }
}
