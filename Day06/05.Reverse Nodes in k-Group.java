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
    //O(n)
    //O(1)
    ListNode th=null;
    ListNode tt=null;
    public void addFirst(ListNode node){
        if(th==null ){
            th=node;
            tt=node;
        }else{
            node.next=th;
            th=node;
        }
    }
    public int getLength(ListNode head){
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next==null || k==0){
            return head;
        }
        
        ListNode oh=null;
        ListNode ot=null;
        
        int len=getLength(head);
        ListNode curr=head;
        
        while(len>=k){
            int tempK=k;
            while(tempK-->0){
                ListNode forw=curr.next;
                curr.next=null;
                addFirst(curr);
                curr=forw;
            }
            
            if(oh==null ){
                oh=th;
                ot=tt;
            }else{
                ot.next=th;
                ot=tt;
            }
            
            th=null;
            tt=null;
            len-=k;
        }
        ot.next=curr;
        return oh;
    }
}