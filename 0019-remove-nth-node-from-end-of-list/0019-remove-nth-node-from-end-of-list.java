/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ptr=head, pre = head;
        int x = 0;
        while(x < n ) {
            ptr = ptr.next;
            x++;
        }
        if(ptr == null ){
            return head.next;
        }
        while(ptr.next!=null) {
            ptr = ptr.next;
            pre = pre.next;
        }
        pre.next = pre.next.next;
        
        return head;
    }
}