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
    public ListNode swapPairs(ListNode head) {
	    // base case if linkedlist contains zero or only one element in it ( to avoid null pointer exception).
        if(head==null || head.next==null) return head;
        
        ListNode first = head; 
        ListNode second = head.next;
        
        while(first!=null && first.next!=null){
            // swap only the value of first and second node.
            int temp=first.val;
            first.val=second.val;
            second.val=temp;
            
            first = second.next; // Move first node to 3rd node OR two node further.
            if(first!=null) // to avoid null pointer exception.
                second=first.next;  // Move second node to 4th node OR two node further.
        }
        return head; // Return the head node
    }
}