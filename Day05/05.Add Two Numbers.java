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
    //O(max(list1,list2))
    //O(N)
    public ListNode addTwoNumbers(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode(-1);
        ListNode head=dummy;
        ListNode tail=dummy;
        
        int carry=0;
        while(list1!=null || list2!=null || carry>0){
            
            int val1=(list1==null?0:list1.val);
            int val2=(list2==null?0:list2.val);
            
            ListNode newNode=new ListNode((val1+val2+carry)%10);
            carry=(val1+val2+carry)/10;
            
            tail.next=newNode;
            tail=newNode;
            
            if(list1!=null){
                list1=list1.next;
            }
            if(list2!=null){
                list2=list2.next;
            }
            
        }
        return dummy.next;
    }
}