public class Solution876 {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode middleNode(ListNode head) {
        int list_length = 0;
        ListNode head_copy = head;
        while (head_copy != null) {
            head_copy = head_copy.next;
            list_length++;
        }

        int left_length = 0;
        while (head != null) {
            if (list_length % 2 != 0) {
                if (left_length == list_length - left_length - 1) {
                    return head;
                }
            } else {
                if (left_length == list_length - left_length) {
                    return head;
                }
            }

            left_length++;
            head = head.next;
        }

        return null;
    }
}
