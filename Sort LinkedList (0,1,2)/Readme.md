Given the head of a linked list where nodes can contain values 0s, 1s, and 2s only. Your task is to rearrange the list so that all 0s appear at the beginning, followed by all 1s, and all 2s are placed at the end.
Examples:
Input: head = 1 → 2 → 2 → 1 → 2 → 0 → 2 → 2
Output: 0 → 1 → 1 → 2 → 2 → 2 → 2 → 2
Explanation: All the 0s are segregated to the left end of the linked list, 2s to the right end of the list, and 1s in between. The final list will be:
   

✅ Approach 1: Counting Method (Most Common & Easiest)
Steps:
1.Traverse the list once → count number of 0, 1, and 2
2.Traverse again → rewrite the node values in sorted order
This works because values are only 0,1,2.

OPTIMAL APPROACH-> O(N)
✅ Approach 2: Create 3 separate linked lists (0-list, 1-list, 2-list)
This keeps nodes intact, only rearranges pointers.
Steps:

Create 3 dummy nodes:
1.zeroHead
2.oneHead
3.twoHead

Traverse original LL and attach nodes to 0-list, 1-list, 2-list.
Connect them at the end:
zero → one → two
Return new head.
