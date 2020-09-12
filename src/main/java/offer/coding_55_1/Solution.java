package offer.coding_55_1;

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {

    int max = 0;

    public int maxDepth(TreeNode root) {
        calDep(root, 1);

        return  max;
    }

    public void calDep(TreeNode node, int dep) {
        if (node == null) {
            if (max < dep) {
                max = dep - 1;
            }

            return;
        }

        calDep(node.left, dep + 1);
        calDep(node.right, dep + 1);
    }
}
