package offer.coding_32_2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();

        List<TreeNode> treeNodeList = new ArrayList<>();

        if (null == root) {
            return list;
        }

        Queue<TreeNode> queue = new ArrayDeque<>();
        Map<TreeNode, Integer> map = new HashMap<>();

        queue.offer(root);
        treeNodeList.add(root);
        map.put(root, 0);
        int maxLevel = 0;
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();

            if (node.left != null) {

                queue.offer(node.left);
                treeNodeList.add(node.left);
                int level = map.get(node);
                int newLevel = level + 1;
                map.put(node.left, newLevel);

                if (newLevel > maxLevel) {
                    maxLevel = newLevel;
                }
            }

            if (node.right != null) {
                queue.offer(node.right);
                treeNodeList.add(node.right);

                int level = map.get(node);
                int newLevel = level + 1;
                map.put(node.right, newLevel);

                if (newLevel > maxLevel) {
                    maxLevel = newLevel;
                }
            }
        }
        //
        for (int i = 0; i <= maxLevel; i++) {
            list.add(new ArrayList<>());
        }

        for (TreeNode node : treeNodeList) {
            int level = map.get(node);
            List<Integer> levelList = list.get(level);

            levelList.add(node.val);
        }

        return list;
    }
}
