/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 /*   SPACE COMPLEXITY -> O(n)
 if you want to detect a cycle using the address of the node (the node reference) and NOT the value, then the correct approach is to store the node itself in a HashSet — not the node’s value.
Here is the clean function that uses node address, not element:

public boolean hasCycle(ListNode head) {
    HashSet<ListNode> seen = new HashSet<>();

    ListNode curr = head;
    while (curr != null) {
        // if this exact node address was seen earlier
        if (seen.contains(curr)) {
            return true;   // cycle detected
        }
        seen.add(curr);     // store node address
        curr = curr.next;
    }
    return false;           // no cycle
}
 */

 //OPTIMAL SOLUTION Tortoise and Hare Problem
 //uses floyd Warshall algo ->0(1) space complexity
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slowptr=head;
        ListNode fastptr=head;

        while(slowptr!=null
            && fastptr!=null
            && fastptr.next!=null){

                slowptr=slowptr.next;
                fastptr=fastptr.next.next;

                if(slowptr==fastptr)
                    return true;
            }
        return false;
    }
}