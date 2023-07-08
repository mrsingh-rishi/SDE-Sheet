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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k == 1)
            return head;
        ListNode dummy = new ListNode(-1), curr = dummy, nex = dummy, pre = dummy;
        dummy.next = head;
        int length = lengthOfLL(head);

        while(length >= k){
            curr = pre.next;
            nex = curr.next;
            for(int i = 1; i < k; i++){
                curr.next = nex.next;
                nex.next = pre.next;
                pre.next = nex;
                nex = curr.next;
            }
            length -= k;
            pre = curr;
        }
        return dummy.next;
    }

    int lengthOfLL(ListNode head){
        int sz = 0;
        while(head != null){
            sz++;
            head = head.next;
        }
        return sz;
    }
}
