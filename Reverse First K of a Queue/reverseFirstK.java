class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        // code here
        //sanity checks
        if (q.isEmpty() || k <= 0 || k > q.size()) 
            return q;
        
        Stack<Integer> st = new Stack<>();
        
        // Step 1: Push first k elements into stack
        for (int i = 0; i < k; i++) {
            st.push(q.poll());
        }
        
        // Step 2: Pop from stack and add back to queue
        while (!st.isEmpty()) {
            q.offer(st.pop());
        }
        
        // Step 3: Move the remaining elements to the back
        int remaining = q.size() - k;
        for (int i = 0; i < remaining; i++) {
            q.offer(q.poll());
        }
        
        return q;
        
    }
}
