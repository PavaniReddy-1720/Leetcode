/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        //copy the value of that node
        node.val=node.next.val;
        //changing the link of the node
        node.next=node.next.next;
    }
}