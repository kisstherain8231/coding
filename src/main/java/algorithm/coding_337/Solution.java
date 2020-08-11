package algorithm.coding_337;

 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class Solution {
    public int rob(TreeNode root) {
        int max = 0;

        if (null == root) {
            return 0;
        }
        TreeNode left = root.left;
        int leftSum = 0;

        if (left == null) {
            leftSum = 0;
        } else {
            leftSum =  rob(left.left) + rob(left.right);
        }

        TreeNode right = root.right;

        int rightSum = 0;

        if (right == null) {
            rightSum = 0;
        } else {
            rightSum = rob(right.left) + rob(right.right);
        }

        return Math.max(root.val + leftSum + rightSum, rob(left) + rob(right));
    }
}
