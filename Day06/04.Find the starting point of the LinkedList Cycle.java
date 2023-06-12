/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    //Jai Baba Bhole
    //o(n/2)+O(n/2)~=O(n)
    //O(1)
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
        }
        
        //Cycle Not found then check
        if(fast==null || fast.next==null){
            return null;
        }
        
        ListNode curr1=head;
        ListNode curr2=slow;//or fast
        
        while(curr1!=curr2){
            curr1=curr1.next;
            curr2=curr2.next;
        }
        
        return curr1;  // or curr2
    }
}