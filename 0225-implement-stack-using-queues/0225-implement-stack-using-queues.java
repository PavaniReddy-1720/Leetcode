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
/**
--> IMPLEMENTING Stack using One queue

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

/**
1. offer()
➤ Adds an element to the queue
➤ Does NOT throw an exception if the queue is full
➤ Returns true / false

2. poll()
➤ Removes and returns the front element of the queue
➤ If the queue is empty → returns null

3. peek()
➤ Returns the front element of the queue
➤ Does NOT remove it
➤ If empty → returns null
 */
