class Solution {

    private int convert(Node root) {
        // Base case
        if (root == null) return 0;

        // Recursively get left & right subtree sums
        int leftSum = convert(root.left);
        int rightSum = convert(root.right);

        // Store current node's old value
        int oldVal = root.data;

        // Set current node's value = sum of left & right subtree
        root.data = leftSum + rightSum;

        // Return sum including the old value
        return root.data + oldVal;
    }

    public void toSumTree(Node root) {
        convert(root);
    }
}
