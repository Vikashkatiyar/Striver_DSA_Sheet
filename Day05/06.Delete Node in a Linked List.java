//  Constraint:-
// You are given the node to be deleted node.
//  You will not be given access to the first node of head.


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution {
    //Jai Baba Bhole
    //O(1)
    //O(1)
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
}