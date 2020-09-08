package offer.coding_28;

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {

    public boolean isSymmetric(TreeNode root) {

        return doJudge(root);
    }

    public boolean doJudge(TreeNode node) {
        boolean res = true;

        if (node.left == null && node.right != null) {
            return false;
        } else if (node.right == null && node.left != null) {
            return false;
        } else if (node.left == null && node.right == null) {
            return true;
        } else {
            if (node.left.val == node.right.val) {
               res =  doJudge(node.left) && doJudge(node.right);

               return res;
            } else {
                return false;
            }

        }

    }
}
