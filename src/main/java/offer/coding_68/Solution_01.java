package offer.coding_68;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Solution_01 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        List<TreeNode> listP = findPath(root, p);
        List<TreeNode> listQ = findPath(root, q);
        Collections.reverse(listP);
        Collections.reverse(listQ);

        int min = Math.min(listP.size(), listQ.size());

        List<TreeNode> comonList = new ArrayList<>();
        for (int i = 0; i < min; i++) {
            TreeNode pNode = listP.get(i);

            TreeNode qNode = listQ.get(i);

            if (pNode == qNode) {
                comonList.add(pNode);
            } else {
                break;
            }

        }

        return comonList.get(comonList.size() - 1);
    }


    List<TreeNode> findPath(TreeNode node, TreeNode target) {

        if (node == null) {
            return new ArrayList<>();
        }

        if (node == target) {
            List<TreeNode> list = new ArrayList<>();
            list.add(node);

            return list;
        }

        List<TreeNode> res = new ArrayList<>();

        List<TreeNode> left = findPath(node.left, target);
        List<TreeNode> right = findPath(node.right, target);

        if (!left.isEmpty()) {

            res.addAll(left);
            res.add(node);
        }

        if (!right.isEmpty()) {
            res.addAll(right);
            res.add(node);
        }

        return res;
    }
}
