package offer.coding_27;

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {

    public TreeNode mirrorTree(TreeNode root) {

        TreeNode res = root;

        doMirror(root);

        return res;
    }

    public void doMirror(TreeNode node) {
        if (node == null) {
            return;
        }
        // 交换左右子树
        {
            TreeNode tmp = node.left;
            node.left = node.right;
            node.right = tmp;
        }
        doMirror(node.left);
        doMirror(node.right);
    }

}
