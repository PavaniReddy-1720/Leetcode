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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode returnNode = new ListNode(Integer.MIN_VALUE);  // dummy node
        ListNode headNode = returnNode;  // store head

        while (l1 != null && l2 != null) {

            if (l1.val <= l2.val) {
                returnNode.next = l1;
                l1 = l1.next;
            } else {
                returnNode.next = l2;
                l2 = l2.next;
            }

            returnNode = returnNode.next;
        }

        // Add remaining nodes
        if (l1 == null) {
            returnNode.next = l2;
        } else {
            returnNode.next = l1;
        }

        // return the actual merged head
        return headNode.next;
    }
}

/**
BRUTEFORCE using array
takes O(n) space Complexity
public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

    ArrayList<Integer> arr = new ArrayList<>();

    while (l1 != null) {
        arr.add(l1.val);
        l1 = l1.next;
    }

    while (l2 != null) {
        arr.add(l2.val);
        l2 = l2.next;
    }

    Collections.sort(arr);

    ListNode dummy = new ListNode(0);
    ListNode curr = dummy;

    for (int val : arr) {
        curr.next = new ListNode(val);
        curr = curr.next;
    }

    return dummy.next;
}
 */