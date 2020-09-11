package offer.coding_37;

import java.util.LinkedList;
import java.util.Queue;

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (null == root) return  "[]";
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);
        StringBuilder stringBuilder = new StringBuilder("[");

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            if (node != null) {
                stringBuilder.append(node.val).append(",");

                queue.offer(node.left);
                queue.offer(node.right);
            } else {
                stringBuilder.append("null").append(",");
            }

        }

        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        stringBuilder.append("]");

        return stringBuilder.toString();
    }


    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {

        if (data.equals("[]")) {
            return null;
        }
        String[] vals = data.substring(1, data.length() - 1).split(",");
        TreeNode root = new TreeNode(Integer.parseInt(vals[0]));
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        int i = 1;

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            if (!vals[i].equals("null")) {
                node.left = new TreeNode(Integer.parseInt(vals[i]));
                queue.add(node.left);
            }
            i++;

            if (!vals[i].equals("null")) {
                node.right = new TreeNode(Integer.parseInt(vals[i]));
                queue.add(node.right);
            }
            i++;

        }

        return root;
    }
}
