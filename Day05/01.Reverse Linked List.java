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

//  Aproch01:- Optimized Approch
class Solution {
    //Jai Baba Bhole
    //O(n)
    //O(1)
    public ListNode reverseList(ListNode head) {
        ListNode dummy=null;
        while(head!=null){
            ListNode nextNode=head.next;
            head.next=dummy;
            dummy=head;
            head=nextNode;
        }
        return dummy;
    }
}

// Approch02:- addFirst
//Not More efficient
class Solution {
     ListNode th=null;
     ListNode tt=null;
    public  void addFirst(ListNode node){
        if(th==null){
            th=node;
            tt=node;
        }else{
           node.next=th;
            th=node;
            
        }
        
    }
    
    public ListNode reverseList(ListNode head) {
        ListNode curr=head;
        
        while(curr!=null){
            ListNode fr=curr.next;
            curr.next=null;
            addFirst(curr);
            curr=fr;
        }
        return th;
        
    }
}