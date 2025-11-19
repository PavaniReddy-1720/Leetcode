import java.util.LinkedList;
import java.util.Queue;
//--> IMPLEMENTING Stack using One queue

import java.util.LinkedList;
import java.util.Queue;

class MyStack {

    Queue<Integer> q = new LinkedList<>();

    public MyStack() { }

    // PUSH operation (costly)
    public void push(int x) {
        q.offer(x);

        // Rotate the queue to bring the new element to the front
        for (int i = 1; i < q.size; i++) {
            q.offer(q.poll());
        }
    }

    // POP operation
    public int pop() {
        if (q.isEmpty()) return -1;
        return q.poll(); 
    }

    // TOP operation
    public int top() {
        if (q.isEmpty()) return -1;
        return q.peek();
    }

    // EMPTY operation
    public boolean empty() {
        return q.isEmpty();
    }
}
 */
