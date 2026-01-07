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
    long totalSum = 0;
    long maxProduct = 0;
    int MOD = 1000000007;
    public int maxProduct(TreeNode root) {
        // Step 1: find total sum of tree
        totalSum = findTotalSum(root);

        // Step 2: compute max product
        findMaxProduct(root);

        return (int)(maxProduct % MOD);
    }

    // DFS to find total sum
    private long findTotalSum(TreeNode node) {
        if (node == null) return 0;

        return node.val
                + findTotalSum(node.left)
                + findTotalSum(node.right);
    }

    // DFS to find max product
    private long findMaxProduct(TreeNode node) {
        if (node == null) return 0;

        long leftSum = findMaxProduct(node.left);
        long rightSum = findMaxProduct(node.right);

        long subTreeSum = node.val + leftSum + rightSum;

        // product if we cut above this subtree
        long product = subTreeSum * (totalSum - subTreeSum);

        maxProduct = Math.max(maxProduct, product);

        return subTreeSum;
    }
}