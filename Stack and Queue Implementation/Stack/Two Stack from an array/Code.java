//https://www.geeksforgeeks.org/problems/implement-two-stacks-in-an-array/1
HOW IT WORKS
Stack 1:
grows from left → right
starts at top1 = -1
  
Stack 2:
grows from right → left
starts at top2 = size
They grow towards each other.
  
We check for space using:
if (top1 + 1 < top2)
This ensures they never collide.

  
class twoStacks {
    
    int size=100;
    int [] arr =new int[size];
    int top1; //top pointer for stack1
    int top2; //top pointer for stack2
    
    twoStacks() {
        top1=-1;
        top2=size;
    }

    // Function to push an integer into the stack1.
    void push1(int x) {
        if(top1 + 1<top2){ //check for space
            arr[++top1]=x;
            
        }
        
    }

    // Function to push an integer into the stack2.
    void push2(int x) {
        if(top1 +1 <top2){
            arr[--top2]=x;
        }
    }

    // Function to remove an element from top of the stack1.
        
    int pop1() {
        if(top1>=0){
            return arr[top1--];
        }
        return -1;
    }

        
    // Function to remove an element from top of the stack2.
    int pop2() {
        if(top2<size){
            return arr[top2++];
        }
        return -1;
    }
}
