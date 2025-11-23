 ArrayList<Integer> result = new ArrayList<>();
        
        if (root == null) return result;
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            
            // Traverse each level
            for (int i = 0; i < size; i++) {
                Node curr = queue.poll();
                
                // First node of each level = left view
                if (i == 0) {
                    result.add(curr.data);
                }
                
                if (curr.left != null) queue.add(curr.left);
                if (curr.right != null) queue.add(curr.right);
            }
        }
        
        return result;
