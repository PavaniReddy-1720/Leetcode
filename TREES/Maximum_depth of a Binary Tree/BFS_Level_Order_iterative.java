public int height(TreeNode root) {
    if (root == null) return 0;

    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);
    int height = 0;

    while (!q.isEmpty()) {
        int size = q.size();   // Nodes at current level
        height++;

        for (int i = 0; i < size; i++) {
            TreeNode node = q.poll();

            if (node.left != null) q.add(node.left);
            if (node.right != null) q.add(node.right);
        }
    }
    return height;
}
