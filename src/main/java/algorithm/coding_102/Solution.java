package coding_102;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class LevelTreeNode {
   public TreeNode node;

   public int level;

   LevelTreeNode(TreeNode node, int level) {
       this.node = node;
       this.level = level;
   }

}

public class Solution {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();

        Map<Integer, List<Integer>> result = new TreeMap<Integer, List<Integer>>();

        Queue<LevelTreeNode> queue = new ArrayDeque<LevelTreeNode>();

        if (null == root) {
            return list;
        }

        queue.add(new LevelTreeNode(root, 0));

        List<Integer> rootList = new ArrayList<Integer>();
        rootList.add(root.val);

        list.add(rootList);

        //
        while (!queue.isEmpty()) {
            LevelTreeNode levelTreeNode = queue.poll();

            TreeNode left  = levelTreeNode.node.left;
            TreeNode right = levelTreeNode.node.right;
            int level = levelTreeNode.level;

            if (null != left) {
                int currLevel  = level + 1;
                queue.add(new LevelTreeNode(left, currLevel));

                List<Integer>  levelList = result.get(currLevel);

                if (levelList == null) {
                    levelList = new ArrayList<Integer>();
                    result.put(currLevel, levelList);
                    levelList.add(left.val);
                } else {
                    levelList.add(left.val);
                }

            }
            if (null != right) {
                int currLevel  = level + 1;
                queue.add(new LevelTreeNode(right, currLevel));

                List<Integer>  levelList = result.get(currLevel);

                if (levelList == null) {
                    levelList = new ArrayList<Integer>();

                    result.put(currLevel, levelList);
                    levelList.add(right.val);
                } else {
                    levelList.add(right.val);
                }


            }

        }

        for (List<Integer> tmpList : result.values()) {
            list.add(tmpList);
        }

        return list;
    }
}
