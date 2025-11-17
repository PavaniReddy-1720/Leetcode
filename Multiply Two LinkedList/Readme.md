https://www.geeksforgeeks.org/problems/multiply-two-linked-lists/1
Given elements as nodes of the two singly linked lists. The task is to multiply these two linked lists, say L1 and L2.
Note: The output could be large take modulo 10^9+7.
Examples :

Input: LinkedList L1 : 3->2 , LinkedList L2 : 2
Output: 64
Explanation: 
Multiplication of 32 and 2 gives 64.
Approach (Very Simple): Convert LL to Number → Multiply → Mod 1e9+7
This is the standard GFG problem:
Multiply two linked lists (modulo 1000000007).

✅ Step-by-step Logic
1. Traverse list1 → build number A
  Formula:
  A = (A * 10 + node.data) % mod

2. Traverse list2 → build number B
  B = (B * 10 + node.data) % mod

3. Return (A * B) % mod
