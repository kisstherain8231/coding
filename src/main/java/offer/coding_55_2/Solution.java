package offer.coding_55_2;

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {

    public  boolean isBanced = true;

    public boolean isBalanced(TreeNode root) {
        calDep(root);

        return isBanced;
    }

    public int calDep(TreeNode node) {
        if (node == null) {

            return  0;
        }

        int left = calDep(node.left) + 1;
        int right = calDep(node.right) + 1;
        if (Math.abs(left - right) > 1) {
            isBanced = false;
        }

        int dep = Math.max(left, right);

        return dep;
    }
}
