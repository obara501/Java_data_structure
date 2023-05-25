/* In this example, we'll examine a simple task: reversing a word.
 * A stack is used to reverse the letters. First, the characters are extracted one by one form the input
 * and pushed onto the stack. Then they're poppedoff the stack and displayed. This taked advantage of the LIFO
 * paradigm. The stack reverses the order of the characters.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class StackX {
    private int maxSize;
    private char[] stackArray;
    private int top;
    
    //Constructor
    public StackX(int max){
        maxSize = max;
        stackArray = new char[maxSize];
        top = -1;
    }
    
    //Push element to top of stack
    public void push(char j){
        stackArray[++top] = j;
    }
    
    //Pop element from top of stack
    public char pop(){
        return stackArray[top--];
    }
    
    //Peek at top of stack
    public char peek(){
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

//Class reverse
class Reverser{
    private String input;
    private String output;
    
    //Constructor
    public Reverser(String in){
        input = in;
    }
    
    //Reverse string
    public String doRev(){
        int stackSize = input.length();
        StackX theStack = new StackX(stackSize);
        
        for(int j=0; j<input.length(); j++){
            char ch = input.charAt(j);
            theStack.push(ch);
        }
        
        output = "";
        while(!theStack.isEmpty()){
            char ch = theStack.pop();
            output = output + ch;
        }
        return output;
    }
}

//Main class
public class ReverseApp {

    //Get string
    public static String getString() throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
    
    public static void main(String[] args) throws IOException {
        String input, output;
        while(true){
            System.out.print("Enter a string: ");
            System.out.flush();
            input = getString();
            if(input.equals("")){
                break;
            }
            
            Reverser theReverser = new Reverser(input);
            output = theReverser.doRev();
            System.out.println("Reversed: " + output);
        }
    }
}
