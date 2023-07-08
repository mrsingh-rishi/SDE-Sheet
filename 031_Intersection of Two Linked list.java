// Approach 1
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int szA = size(headA);
        int szB = size(headB);

        if(szA > szB){
            while(szA != szB){
                headA = headA.next;
                szA--;
            }
        }
        else{
            while(szA != szB){
                headB = headB.next;
                szB--;
            }
        }

        while(headA != null && headB != null){
            if(headA == headB){
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }

        return null;
    }
    int size(ListNode head){
        int sz = 0;
        ListNode temp = head;
        while(temp != null){
            sz ++;
            temp = temp.next;
        }
        return sz;
    }
}

// Approach 2
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    //boundary check
    if(headA == null || headB == null) return null;
    
    ListNode a = headA;
    ListNode b = headB;
    
    //if a & b have different len, then we will stop the loop after second iteration
    while( a != b){
    	//for the end of first iteration, we just reset the pointer to the head of another linkedlist
        a = a == null? headB : a.next;
        b = b == null? headA : b.next;    
    }
    
    return a;
  }
}
