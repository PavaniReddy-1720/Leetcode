/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // sanity checks
        if(head==null || head.next==null)
            return head;
        
        Node zeroD=new Node(-1);
        Node oneD=new Node(-1);
        Node twoD=new Node(-1);
        
        //dummy pointers
        Node zero=zeroD, one=oneD,two=twoD;
        
        //temporary pointer for original LinkedList
        Node temp=head;
        
        while(temp!=null){
            if (temp.data==0){
                zero.next=temp;
                zero=zero.next;
            }
            else if(temp.data==1){
                one.next=temp;
                one=one.next;
            }
            else{
                two.next=temp;
                two=two.next;
            }
            temp=temp.next;
        }
        //connnecting all dummy nodes
        zero.next=(oneD.next!=null)? oneD.next:twoD.next;
        one.next=twoD.next;
        two.next=null;
        
        return zeroD.next;
        
    }
}
