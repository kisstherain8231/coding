package algorithm.coding_235;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {


        List<TreeNode> pList = new ArrayList<>();
        List<TreeNode> qList = new ArrayList<>();

        dfs(root, p, pList);
        dfs(root, q, qList);

        Collections.reverse(pList);
        Collections.reverse(qList);


        int i = 0;

        while (i < pList.size() && i < qList.size()) {
            if (pList.get(i) != qList.get(i)) {
                break;
            }
            i++;
        }

        return pList.get(i - 1);

    }


    public  boolean dfs(TreeNode node, TreeNode p, List<TreeNode> list) {

        if (node == null) {
            return false;
        }

        if (node.val == p.val) {
            list.add(node);

            return true;
        }

        boolean leftResult =  dfs(node.left, p, list);

        boolean rightResult =  dfs(node.right,p, list);

        if (leftResult || rightResult) {
            list.add(node);
        }

        return leftResult || rightResult;

    }
}
