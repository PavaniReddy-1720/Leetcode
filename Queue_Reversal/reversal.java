####----------->USING RECURSION
class Solution {
    public void reverseQueue(Queue<Integer> q) {
        
        //base condition for recursion
        if(q.isEmpty()) return;
        
        int val=q.poll();   //remove first element
        reverseQueue(q);    // recurse for remaining queue
        q.offer(val);       // add elment back to end
    }
}

####-------->USING STACK (using extra Space)
class Solution {
    public void reverseQueue(Queue<Integer> q) {
        Stack<Integer> st=new Stack<>();
        
        while(!q.isEmpty()){
            st.push(q.poll());
        }
        while(!st.isEmpty()){
            q.offer(st.pop());
        }
    }
}
