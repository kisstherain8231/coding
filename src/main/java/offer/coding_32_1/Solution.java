package offer.coding_32_1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Solution {

    public int[] levelOrder(TreeNode root) {

        if (null == root) {
            return new int[0];
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();

        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            list.add(node.val);

            if (node.left != null) {
                queue.offer(node.left);
            }

            if (node.right != null) {
                queue.offer(node.right);
            }
        }

        int size = list.size();

        int res[] = new int[size];

        int i = 0;
        for (Integer e : list) {
            res[i] = e;
            i++;
        }

        return res;
    }
}
