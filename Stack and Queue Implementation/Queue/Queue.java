/*QUEUE IMPLEMENTATION FROM SCRATCH (Using Array)
Operations:
enqueue(x)
dequeue()
peek()
isEmpty()
isFull()
This uses front, rear, and circular array.
*/
Code:
class MyQueue {
    int front, rear, size;
    int capacity;
    int[] arr;

    MyQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // enqueue -> add element
    void enqueue(int x) {
        if (size == capacity) {
            System.out.println("Queue Overflow");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = x;
        size++;
    }

    // dequeue -> remove element
    int dequeue() {
        if (size == 0) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int item = arr[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    // peek front element
    int peek() {
        if (size == 0) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == capacity;
    }
}
