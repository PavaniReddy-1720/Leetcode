import java.util.LinkedList;
import java.util.Queue;

class MyStack {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public MyStack() { }

    public void push(int x) {
        // Move all q1 → q2
        while (!q1.isEmpty()) {
            q2.offer(q1.poll());
        }

        // Insert new element in q1
        q1.offer(x);

        // Move back q2 → q1
        while (!q2.isEmpty()) {
            q1.offer(q2.poll());
        }
    }

    public int pop() {
        if (q1.isEmpty())
            return -1;
        return q1.poll();
    }

    public int top() {
        if (q1.isEmpty())
            return -1;
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();  // FIXED
    }
}
