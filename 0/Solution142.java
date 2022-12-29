public class Solution142 {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
 }

    public ListNode detectCycle(ListNode head) {
        //Solution en utilisant l'algorithme de Floyd
        if (head == null) {
            return head;
        }
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if (slowPointer == fastPointer) {
                //Une boucle a été détectée
                break;
            }
        }
        if (fastPointer == null || fastPointer.next == null) {
            return null;
        } else {
            slowPointer = head;
            while (slowPointer != fastPointer) {
                slowPointer = slowPointer.next;
                fastPointer = fastPointer.next;
            }
            return slowPointer;
        }
    }
}
