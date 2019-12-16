package coding_236;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        List<TreeNode> left = new ArrayList<>();
        List<TreeNode> right = new ArrayList<>();
        TreeNode result = null;

        dfs(root, p, left);
        dfs(root, q, right);

        Collections.reverse(left);
        Collections.reverse(right);

        if (left.size() <= 1) {
            if (left.get(0).equals(right.get(0))) {
                return  (left.get(0));
            }

        }

        if (right.size() <= 1) {
            if (right.get(0).equals(left.get(0))) {
                return  (right.get(0));
            }
        }

        int i = 1;

        boolean same = true;

        while (i < left.size() && i < right.size()) {
            if (!left.get(i).equals(right.get(i))) {
                result =  left.get(i -1);
                same = false;

                break;
            }
            i++;
        }


        if (same == true) {
            int min = Math.min(left.size(), right.size());
            result = left.get(min -1);
        }


        return result;
    }


    public boolean dfs(TreeNode node, TreeNode target, List<TreeNode> list) {
        if (null == node) {
            return false;
        }

        if (target == node) {
            list.add(node);
            return true;
        }

        boolean left =  dfs(node.left, target, list);
        boolean right = dfs(node.right, target, list);

        if (left || right) {
            list.add(node);
        }

        return left || right;
    }
}
