Given a binary tree with n nodes, determine whether all the leaf nodes are at the same level or not. Return true if all leaf nodes are at the same level, and false otherwise.

Examples :

Input: root = [1, 2, 3]
    1
   / \
  2   3
Output: true
Explanation: The binary tree has a height of 2 and the leaves are at the same level.
Input: root = [10, 20, 30, 10, 15, N, N]
    10
   /  \
 20   30
 /  \
 10   15
Output: false
Explanation: The binary tree has a height of 3 and the leaves are not at the same level.
Input: root = [3, 2, 1]
    3
   / \
  2   1
Output: true
Explanation: The binary tree has a height of 2 and the leaves are at the same level.
