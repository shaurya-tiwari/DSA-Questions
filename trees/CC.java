import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int x) {
        val = x;
    };

}

public class CC {
    // creating trenode
    public List<Integer> rightview(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();

        dfs(root, 0, list);

        return list;

    }

    public void dfs(TreeNode root, int level, List<Integer> list) {
        if (root == null) {
            return;
        }

        if (level == list.size()) { // for check
            list.add(root.val);
        }
        // for right view , we gor right first
        dfs(root.right, level + 1, list);
        dfs(root.left, level + 1, list);

    }

    public static void main(String[] args) {
        // filliuing laues in tree node
        cc cc = new CC();
        cc.rightview()
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(9);

        rightview(root);

    }
}
