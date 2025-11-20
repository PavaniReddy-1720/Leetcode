class MyStack {

    Deque<Integer> dq = new ArrayDeque<>();

    public MyStack() {
        
    }

    public void push(int x) {
        dq.addLast(x);       // push on top
    }

    public int pop() {
        return dq.removeLast();   // remove top
    }

    public int top() {
        return dq.peekLast();     // top element
    }

    public boolean empty() {
        return dq.isEmpty();
    }
}
