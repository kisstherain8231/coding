package offer.coding_26;

import java.util.ArrayList;
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

    List<TreeNode> sameNodeList = new ArrayList<>();

    public boolean isSubStructure(TreeNode A, TreeNode B) {

        if (B == null) {
            return false;
        }

        doFind(A, B);

        if(sameNodeList.isEmpty()) {
            return false;
        }
        boolean res = false;
        for (TreeNode node : sameNodeList) {
            boolean tmpRes =  judge(node, B);

            res = tmpRes || res;
        }
        return res;
    }


    public void doFind(TreeNode nodeA, TreeNode target) {
        if (nodeA == null) {
            return ;
        }

        if (nodeA.val ==  target.val) {
            sameNodeList.add(nodeA);
        }

        doFind(nodeA.left, target);
        doFind(nodeA.right, target);
    }

    public boolean judge(TreeNode nodeA, TreeNode nodeB) {

        if (nodeA == null && nodeB == null) {
            return true;
        }

        // 当子树的遍历完成，应该返回
        if (nodeA != null && nodeB == null) {
            return true;
        }

        if (nodeA == null && nodeB != null) {

            return false;
        }

        boolean res = false;

        if (nodeA.val != nodeB.val) {

            return false;
        }

        if (nodeA.val == nodeB.val) {
            res = true;
        }
        boolean left = judge(nodeA.left, nodeB.left);
        boolean right = judge(nodeA.right, nodeB.right);

        return (left && right) && res;
    }
}
