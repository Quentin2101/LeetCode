public class Solution21 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        } else if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        } else {
           ListNode result = new ListNode();
           ListNode result_head = result;
           
           while(list1 != null && list2 != null) {
               if (list1.val == list2.val) {
                   result.next = new ListNode();
                   result = result.next;
                   result.val = list1.val;
                   list1 = list1.next;
                   
                   result.next = new ListNode();
                   result = result.next;
                   result.val = list2.val;
                   list2 = list2.next;
               } else if (list1.val > list2.val) {
                   result.next = new ListNode();
                   result = result.next;
                   result.val = list2.val;
                   list2 = list2.next;
               } else {
                   result.next = new ListNode();
                   result = result.next;
                   result.val = list1.val;
                   list1 = list1.next;
               }
           }
           if (list1 == null) {
               result.next = list2;
           } else {
               result.next = list1;
           }

           return result_head.next;
        }
    }
}
