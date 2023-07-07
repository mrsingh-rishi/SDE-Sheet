/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode next = node.next;
        
        if(next!=null){
            int temp = node.val;
            node.val = next.val;
            next.val = temp;
            
            node.next = next.next;
        }
    }
}
