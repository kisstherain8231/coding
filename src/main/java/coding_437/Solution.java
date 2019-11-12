package coding_437;

import java.util.Deque;
import java.util.LinkedList;

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Solution {

    private int totalCount = 0;

    public int pathSum(TreeNode root, int sum) {

        Deque<TreeNode> queue = new LinkedList<>();

        if (root == null) {
            return 0;
        }

        queue.push(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            // 计算当前节点的左右路径的值
            travelValue(node, sum, 0);

            // left
            if (node.left != null) {
                queue.push(node.left);
            }
            if (node.right != null) {
                queue.push(node.right);
            }
        }

        return totalCount;
    }


    public void travelValue(TreeNode node, int target, int sum) {
        if (node == null) {
            return ;
        }

        sum = sum + node.val;
        if (sum == target) {
            totalCount = totalCount + 1;
        }

        travelValue(node.left, target, sum);
        travelValue(node.right, target, sum);
    }
}
