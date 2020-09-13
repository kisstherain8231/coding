package offer.coding_07;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * 例如，给出
 *
 * 前序遍历 preorder = [3,9,20,15,7]
 * 中序遍历 inorder = [9,3,15,20,7]
 * 返回如下的二叉树：
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/zhong-jian-er-cha-shu-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 */
class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {

    Map<Integer, Integer>  inorderIndexMap = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i  = 0; i < inorder.length; i++) {
            inorderIndexMap.put(inorder[i], i);
        }

        // 构建二叉树

        TreeNode node = doBuild(preorder, inorder,
            0, inorder.length -1,
            0, inorder.length - 1);

        return node;
    }

    public TreeNode doBuild(int[] preorder, int[] inorder,
        int preStart, int preEnd, int inStart, int inEnd) {

        if (preStart > preEnd || inStart > inEnd) {

            return null;
        }

        int pivot = preorder[preStart];
        TreeNode node = new TreeNode(pivot);
        int pivotIndexInIn = inorderIndexMap.get(pivot);

        node.left = doBuild(preorder, inorder,
            preStart + 1, preStart + pivotIndexInIn - inStart,
            inStart,pivotIndexInIn - 1);

        node.right = doBuild(preorder, inorder,
            preStart + pivotIndexInIn - inStart + 1, preEnd,
            pivotIndexInIn + 1, inEnd);

        return node;
    }
}
