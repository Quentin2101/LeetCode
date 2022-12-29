public class Solution206 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        else {
            ListNode result = null;
            while (head != null) {
                ListNode new_node = new ListNode(head.val);
                if (result != null) {
                    new_node.next = result;
                }
                result = new_node;
                head = head.next;
            }

            return result;
        }
    }

    public ListNode reverseListBest(ListNode head) {
            ListNode prev = null;
            ListNode current = head;

            while (current != null) {
                ListNode next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }

            return prev;
    }
}
