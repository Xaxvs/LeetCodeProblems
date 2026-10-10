class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode current = head;

        while (list1 != null || list2 != null) {
            if(list1 == null) {
                current.next = list2;
                break;
            }
            else if(list2 == null){
                current.next = list1;
                break;
            }
            int v1 = list1.val;
            int v2 = list2.val;
            if(v1 < v2) {
                current.next = new ListNode(v1);
                list1 = list1.next;
            } else {
                current.next = new ListNode(v2);
                list2 = list2.next;
            }
            current = current.next;
        }
        return head.next;
    }
}
