package coding_124;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
class Solution {
    private int maxResult  = 0;

    public int maxPathSum(TreeNode root) {
        maxResult = root.val;
        doMaxPathSum(root);

        return maxResult;
    }


    public int doMaxPathSum(TreeNode node) {

        if (node == null) {

            return Integer.MIN_VALUE;
        }

        int left = doMaxPathSum(node.left);

        int right = doMaxPathSum(node.right);

        int rootVal = node.val;

        int maxSubTreeWithroot = Math.max(left + rootVal, right + rootVal);

        int treeVal = left + right + rootVal;

        int maxReturnVal =   Math.max(maxSubTreeWithroot, Math.max(treeVal, rootVal));

        // 计算最大值

        int maxLeaf = Math.max(left, right);


        int max = Math.max(maxLeaf, maxReturnVal);

        maxResult = Math.max(max, maxResult);

        return  maxReturnVal;
    }
}
