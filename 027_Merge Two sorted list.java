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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null)
            return null;
        if(list1 == null){
            return list2;
        }
        else if(list2 == null)
            return list1;
        ListNode head = new ListNode(-1), temp = head, a = list1, b = list2;
        while(a!=null && b!=null){
            if(a.val <= b.val){
                temp.next = a;
                a = a.next;
                temp = temp.next;
                
            }
            else{
                temp.next = b;
                b = b.next;
                temp = temp.next;
            }
        }

        while(a != null){
            temp.next = a;
            a = a.next;
            temp = temp.next;
        }
        while(b != null){
            temp.next = b;
            b = b.next;
            temp = temp.next;
        }
        return head.next;
    }
}
