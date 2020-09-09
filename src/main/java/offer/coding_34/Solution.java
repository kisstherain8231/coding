package offer.coding_34;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = dfs(root, sum, 0);

        for (int i = 0; i < res.size(); i++) {
            List<Integer> path = res.get(i);
            Collections.reverse(path);
        }

        return res;
    }


    List<List<Integer>> dfs(TreeNode node, int sum, int preSum) {
        if (node == null) {
            return new ArrayList<>();
        }

        int tmpSum = preSum + node.val;
        if (tmpSum == sum && node.left == null && node.right == null) {
            List<List<Integer>> resList = new ArrayList<>();
            List<Integer> pathList = new ArrayList<>();

            pathList.add(node.val);
            resList.add(pathList);

            return  resList;
        }

        List<List<Integer>> leftList = dfs(node.left, sum, tmpSum);
        List<List<Integer>> rightList = dfs(node.right, sum, tmpSum);

        for (int i = 0; i < leftList.size(); i++) {
            List<Integer> list = leftList.get(i);
            list.add(node.val);
        }

        for (int i = 0; i < rightList.size(); i++) {
            List<Integer> list = rightList.get(i);
            list.add(node.val);
        }

        List<List<Integer>> res = new ArrayList<>();
        res.addAll(leftList);
        res.addAll(rightList);

        return res;
    }
}
