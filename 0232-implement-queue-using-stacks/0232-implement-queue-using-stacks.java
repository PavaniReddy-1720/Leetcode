//we are considering two stacks ,one for input and other for output stack....
class MyQueue {

    Stack<Integer> input=new Stack<>();
    Stack<Integer> output=new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        input.push(x);
    }
    
    public int pop() {
        peek();
        return output.pop();
    }
    
    public int peek() {
        //edge case->if elements are not in output stack and elements are in input stack..
        //All elements from input stack shd be pushed to output stack and popped...since element can be popped from output stack only
        if(output.empty()){
            while(!input.empty()){
                output.push(input.pop());
            }
        }
        return output.peek();
    }
    
    public boolean empty() {
        return input.empty() && output.empty();
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */