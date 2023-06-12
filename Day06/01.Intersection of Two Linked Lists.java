/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
//Approch01:- BruteForce
public class Solution {
    //Jai Baba Bhole
    //O(n1+n2);
    //O(1)
    public int getSize(ListNode head){
        int size=0;
        while(head!=null){
            head=head.next;
            size++;
        }
        return size;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int size1=getSize(headA);
        int size2=getSize(headB);
        
        
        
        ListNode t1=headA;
        ListNode t2=headB;
        
        int diff=Math.abs(size1-size2);
        if(size1>size2){
            for(int i=0;i<diff;i++){
                t1=t1.next;
            }
        }else{
            for(int i=0;i<diff;i++){
                t2=t2.next;
            }
        }
        
        while(t1!=t2){
            t1=t1.next;
            t2=t2.next;
        }
        return t1;
    }
}


// Approch02:-
