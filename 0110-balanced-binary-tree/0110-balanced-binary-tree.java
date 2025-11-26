/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        // if height() returns -1 → not balanced
        return height(root) != -1;
    }

    private int height(TreeNode node) {
        if (node == null) return 0;

        int left = height(node.left);
        if (left == -1) return -1; // left subtree not balanced

        int right = height(node.right);
        if (right == -1) return -1; // right subtree not balanced

        // if difference is more than 1 → unbalanced
        if (Math.abs(left - right) > 1) return -1;

        // return height of current subtree
        return 1 + Math.max(left, right);
    }
}
