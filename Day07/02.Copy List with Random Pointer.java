/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    //Jai Baba Bhole
    //TC:O(n)+O(n)+O(n)~~O(n)
    //SC:O(1) //making new Node is not extra for this question
    public Node copyRandomList(Node head) {
        Node temp=head;
        
        //Step 1.Assign deep copy of newNode
        while(temp!=null){
            Node newNode=new Node(temp.val);
            newNode.next=temp.next;
            temp.next=newNode;
            temp=temp.next.next;
        }
        
        //Step 2.Assign Random pointer value
        Node itr=head;
        while(itr!=null){
            if(itr.random!=null){
                itr.next.random=itr.random.next;
            }
            itr=itr.next.next;
        }
        
        // Step 3.Separate the Original Deep Copy LinkedList
        Node dummy=new Node(0);
        itr=head;
        temp=dummy;
        Node fast;
        while(itr!=null){
            fast=itr.next.next;
            temp.next=itr.next;
            itr.next=fast;
            temp=temp.next;
            itr=fast;
        }
        
        return dummy.next;
    }
}/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    //Jai Baba Bhole
    //TC:O(n)+O(n)+O(n)~~O(n)
    //SC:O(1) //making new Node is not extra for this question
    public Node copyRandomList(Node head) {
        Node temp=head;
        
        //Step 1.Assign deep copy of newNode
        while(temp!=null){
            Node newNode=new Node(temp.val);
            newNode.next=temp.next;
            temp.next=newNode;
            temp=temp.next.next;
        }
        
        //Step 2.Assign Random pointer value
        Node itr=head;
        while(itr!=null){
            if(itr.random!=null){
                itr.next.random=itr.random.next;
            }
            itr=itr.next.next;
        }
        
        // Step 3.Separate the Original Deep Copy LinkedList
        Node dummy=new Node(0);
        itr=head;
        temp=dummy;
        Node fast;
        while(itr!=null){
            fast=itr.next.next;
            temp.next=itr.next;
            itr.next=fast;
            temp=temp.next;
            itr=fast;
        }
        
        return dummy.next;
    }
}