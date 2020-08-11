package coding_101;

import java.util.LinkedList;
import java.util.Queue;


public class Solution {

    public boolean isSymmetric(TreeNode root) {
        boolean result = true;

        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList();

        queue.add(root.left);
        queue.add(root.right);

        while (!queue.isEmpty()) {
            TreeNode left = queue.poll();
            TreeNode right = queue.poll();

            if (left == null && right == null) {
                continue;
            }

            // 不一样的情况
            if (left == null ^ right == null) {
                return false;
            }

            if (left.val != right.val) {
                return false;
            }

            queue.add(left.left);
            queue.add(right.right);
            queue.add(left.right);
            queue.add(right.left);
        }

        return true;
    }
}
