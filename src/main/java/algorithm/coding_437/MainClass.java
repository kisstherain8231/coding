package algorithm.coding_437;


import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class MainClass {

    public static TreeNode stringToTreeNode(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return null;
        }

        String[] parts = input.split(",");
        String item = parts[0];
        TreeNode root = new TreeNode(Integer.parseInt(item));
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);

        int index = 1;
        while (!nodeQueue.isEmpty()) {
            TreeNode node = nodeQueue.remove();

            if (index == parts.length) {
                break;
            }

            item = parts[index++];
            item = item.trim();
            if (!item.equals("null")) {
                int leftNumber = Integer.parseInt(item);
                node.left = new TreeNode(leftNumber);
                nodeQueue.add(node.left);
            }

            if (index == parts.length) {
                break;
            }

            item = parts[index++];
            item = item.trim();
            if (!item.equals("null")) {
                int rightNumber = Integer.parseInt(item);
                node.right = new TreeNode(rightNumber);
                nodeQueue.add(node.right);
            }
        }
        return root;
    }

    public static void main(String[] args) throws IOException {
        //BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        // while ((line = in.readLine()) != null) {
        line = "[5,4,8,11,null,13,4,7,2,null,null,5,1]";
        TreeNode root = stringToTreeNode(line);
        line = "22";
        int sum = Integer.parseInt(line);

        int ret = new Solution().pathSum(root, sum);

        String out = String.valueOf(ret);

        System.out.print(out);
        // }
    }
}
