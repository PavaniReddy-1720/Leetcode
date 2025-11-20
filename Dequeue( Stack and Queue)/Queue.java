class MyQueue {

    Deque<Integer> dq = new ArrayDeque<>();

    public MyQueue() {
        
    }

    public void push(int x) {
        dq.addLast(x);       // enqueue at rear
    }

    public int pop() {
        return dq.removeFirst();  // dequeue from front
    }

    public int peek() {
        return dq.peekFirst();    // front element
    }

    public boolean empty() {
        return dq.isEmpty();
    }
}
