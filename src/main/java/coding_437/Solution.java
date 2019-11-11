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

    public int pathSum(TreeNode root, int sum) {

        int count = 0;
        Deque<TreeNode> queue = new LinkedList<>();

        if (root == null) {
            return 0;
        }

        queue.push(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            // 计算当前节点的左右路径的值
            count = count + travelLeftVal(node, sum);
            count = count + travelRightVal(node, sum);

            // left
            if (node.left != null) {
                queue.push(node.left);
            }
            if (node.right != null) {
                queue.push(node.right);
            }
        }

        return count;
    }

    public int travelLeftVal(TreeNode node, int target) {
        int targetCount = 0;
        int sum = 0;
        TreeNode nextNode = node;
        while (nextNode != null) {
            sum = nextNode.val + sum;
            if (sum == target) {
                targetCount++;
            }
            nextNode = nextNode.left;
        }

        return targetCount;
    }

    public int travelRightVal(TreeNode node, int target) {
        int targetCount = 0;
        int sum = 0;
        TreeNode nextNode = node;
        while (nextNode != null) {
            sum = nextNode.val + sum;
            if (sum == target) {
                targetCount++;
            }
            nextNode = nextNode.right;
        }

        return targetCount;
    }
}
