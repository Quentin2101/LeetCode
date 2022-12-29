import java.util.*;

public class Solution102 {
    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    //Parcours en largeur
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();

        Deque<TreeNode> queue = new ArrayDeque<TreeNode>();
        List<List<Integer>> result = new ArrayList<>();
        queue.addLast(root);

        while (!queue.isEmpty()) {
            ArrayList<Integer> level_result = new ArrayList<>();
            //ArrayList<TreeNode> deleted_Node = new ArrayList<>();  //Sauvegarder le nombre de TreeNode d'un level plutôt que de recopier le bon nombre de TreeNode
            int level_count = queue.size();

            for (int i = 0; i < level_count; i++) {
                if (queue.peek().left != null) queue.addLast(queue.peek().left);
                if (queue.peek().right != null) queue.add(queue.peek().right);
                level_result.add(queue.removeFirst().val);
            }
            result.add(level_result);
        }

        return result;
    }
}
