package coding_102.solution_1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;



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
        List<List<Integer>> resultList = new ArrayList<List<Integer>>();

        if (null == root) {
            return resultList;
        }

        Deque<TreeNode> deque = new ArrayDeque<TreeNode>();

        deque.add(root);
        List<Integer> rootList =  new ArrayList<Integer>();
        rootList.add(root.val);
        resultList.add(rootList);

        while (!deque.isEmpty()) {
            List<Integer> levelList= new ArrayList<Integer>();

            for (int i = 0; i < deque.size(); i++) {
                TreeNode node =  deque.poll();

                levelList.add(node.val);

                if (node.left != null) {
                    deque.add(node.left);

                }

                if (node.right != null) {
                    deque.add(node.right);
                }
            }
            if (!levelList.isEmpty()) {
                resultList.add(levelList);
            }

        }


        return resultList;
    }
}
