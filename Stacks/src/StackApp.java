class StackX {
    
    //Initialise stack with max size, array variable and top element.
    private int maxSize;
    private long[] stackArray;
    private int top;
    
    //Constructor
    public StackX(int s){
        maxSize = s;
        stackArray = new long[maxSize];
        top = -1;
    }
    
    //Push element to top of stack
    public void push(long j){
        stackArray[++top] = j;
    }
    
    //Pop element from top of stack
    public long pop(){
        return stackArray[top--];
    }
    
    //Peek at top of stack
    public long peek(){
        return stackArray[top];
    }
    
    //Check if stack is empty
    public boolean isEmpty(){
        return (top == -1);
    }
    
    //Check if stack is full
    public boolean isFull(){
        return (top == maxSize-1);
    }
}

//Main class
public class StackApp {
    
    //Main method
    public static void main(String[] args) {
        
        //Create new stack
        StackX theStack = new StackX(10);
        
        //Push elements to stack
        theStack.push(20);
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);
        
        //Pop elements from stack
        while(!theStack.isEmpty()){
            long value = theStack.pop();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println("");
    }
    
}