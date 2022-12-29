import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution589 {
    public static class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    //Recursive solution
    public List<Integer> preorder(Node root) {
        ArrayList<Integer> result = new ArrayList<>();

        if (root == null) {
            return result.stream().toList();
        } else {
            recursive_call(result, root);
        }

        return result.stream().toList();
    }

    public void recursive_call(ArrayList<Integer> list, Node node) {
        list.add(node.val);
        for (int i = 0; i < node.children.toArray().length ; i++) {
            if (node.children.toArray()[i] != null) {
                recursive_call(list, (Node) node.children.toArray()[i]);
            }
        }
    }


    //Iterative solution
    //Parcours en profondeur
    public List<Integer> preorder_iterative(Node root) {
       List<Integer> result = new ArrayList<>();
        if (root != null) {
            Stack<Node> stack = new Stack<>();
            stack.push(root);
            while (!stack.empty()) {
                Node current_node = stack.pop();
                for (int i = current_node.children.size() - 1; i >= 0; i--) {
                    stack.push(current_node.children.get(i));
                }
                result.add(current_node.val);
            }
        }
        return result;
    }
}
