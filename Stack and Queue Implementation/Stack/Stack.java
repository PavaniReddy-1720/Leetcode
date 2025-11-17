/*STACK IMPLEMENTATION FROM SCRATCH (Using Array)
Operations:
  push(x)
  pop()
  peek()
  isEmpty()
  isFull()
*/
class MyStack {
    int top;
    int size;
    int[] arr;

    MyStack(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    // push element to stack
    void push(int x) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x;
    }

    // pop element from stack
    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    // peek top element
    int peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == size - 1;
    }
}
