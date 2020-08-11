package algorithm.coding_543;
/* -----------------------------------
 *  WARNING:
 * -----------------------------------
 *  Your code may fail to compile
 *  because it contains public class
 *  declarations.
 *  To fix this, please remove the
 *  "public" keyword from your class
 *  declarations.
 */


class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}


public class Solution {

    int maxNodes = 0;

    public int diameterOfBinaryTree(TreeNode root) {

        if (root == null) {
            return 0;
        }

        longestPath(root);

        return maxNodes - 1;
    }


    public int longestPath(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftNodes = longestPath(node.left);
        int rightNodes = longestPath(node.right);
        int longestNodes = 0;

        if (node.left == null && node.right == null) {
            longestNodes = 1;
        } else if (node.right != null && node.right != null) {
            longestNodes = leftNodes + rightNodes + 1;
        } else {
            longestNodes = 1 + rightNodes + leftNodes;
        }

        if (longestNodes > maxNodes) {
            maxNodes = longestNodes;
        }

        if (leftNodes < rightNodes) {
            return rightNodes + 1;
        } else {
            return leftNodes + 1;
        }
    }
}

