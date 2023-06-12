//Question Solved in inPlace in Highly recommended

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


// Approch01:- using extra space means creating a new node with less value
 //O(n1+n2)
 //O(n1+n2)



 //Approch02:- don't use extra Space (Optimized approch)
class Solution {
    //Jai Baba Bhole
    // O(n1+n2)
    //o(1)
    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode(-1);
        ListNode head=dummy;
        ListNode tail=dummy;
        
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                tail.next=list1;
                list1=list1.next;
            }else{
                tail.next=list2;
                list2=list2.next;
            }
            tail=tail.next;
        }
        
        if(list1!=null ){
            tail.next=list1;
        }
        else{
            tail.next=list2;
        }
        
        return dummy.next;
    }
}

 