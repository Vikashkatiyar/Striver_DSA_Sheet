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
    //Jai Baba Bhole
    //o(n/2)+O(n/2)+O(n/2)~=O(n)
    //o(1)
    public ListNode getMiddle(ListNode head){
        //O(n/2)
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public ListNode reverse(ListNode head){
        //O(n/2)
        ListNode prev=null;
        ListNode nextNode=null;
        
        while(head!=null){
            nextNode=head.next;
            head.next=prev;
            prev=head;
            head=nextNode;
            
        }
        return prev;
    }
    
    //Main function
    public boolean isPalindrome(ListNode head) {
        ListNode mid=getMiddle(head);
        ListNode slow=reverse(mid.next);
        
        while(slow!=null){
            if(slow.val!=head.val){
                return false;
            }
            slow=slow.next;
            head=head.next;
        }
        return true;
    }
}