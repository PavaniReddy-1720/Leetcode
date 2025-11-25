class Solution {
    int leafLevel = -1; // To store the level of the first leaf node

    boolean check(Node root) {
        return helper(root, 0);
    }

    boolean helper(Node node, int level) {
        if (node == null) return true;

        // Check if it's a leaf node
        if (node.left == null && node.right == null) {
            if (leafLevel == -1) {
                leafLevel = level;  // store the level of the first leaf
            } else if (leafLevel != level) {
                return false; // mismatch -> not same level
            }
            return true;
        }

        // Recursively check left and right subtrees
        return helper(node.left, level + 1) && helper(node.right, level + 1);
    }    
    
}
