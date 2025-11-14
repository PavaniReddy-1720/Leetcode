Linked List – Theory

A Linked List is a linear data structure in which elements, called nodes, are connected using pointers. 
Each node contains:
Data – stores the actual value.
Pointer/Next – stores the reference/address of the next node in the sequence.

Some types of linked lists include:
Singly Linked List: Each node points to the next node.
Doubly Linked List: Each node points to both next and previous nodes.
Circular Linked List: Last node points back to the first node.

Advantages of Linked List

Dynamic Size: Can grow or shrink during runtime.

Efficient Insertions/Deletions: No shifting of elements required.

Better Memory Utilization: Allocates memory as needed.

Flexible Memory: Nodes can be stored anywhere in memory.
Foundation for Other Data Structures: Used in stacks, queues, graphs, etc.

Disadvantages of Linked List

No Random Access: Accessing an element requires traversal (O(n)).
Extra Memory: Each node requires additional memory for a pointer.
Pointer Overhead: Managing pointers increases complexity.

    public class ListNode{
    
      public int val;
      
      public ListNode next;

      public ListNode(int x){
        val=x;
      }
      public static void main(String[] args){
          //creating nodes
          ListNode l1=new ListNode(4);
          ListNode l2=new ListNode(8);
          ListNode l3=new ListNode(12);
    
          //pointing to next nodes
          l1.next=l2;
          l2.next=l3;
          l3.next=null;
    
          //printing nodes
          ListNode ptr=l1;    //ptr is just a pointer/reference used to traverse the linked list.
                          // Its type must be ListNode because it points to nodes of type ListNode.
          while(ptr!=null){
              System.out.println(ptr.val);
              ptr=ptr.next;
          }
      }
    }
      
