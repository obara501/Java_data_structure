//Bubble sort.

//Initialise class ArrayBub
class ArrayBub{
    private long[] a;
    private int nElems;
    
    //Constructor
    public ArrayBub(int max){
        a = new long[max];
        nElems = 0;
    }
    
    //Insert elements
    public void insert(long value){
        a[nElems] = value;
        nElems++;
    }
    
    //Display array
    public void display(){
        for(int j=0; j<nElems; j++){
            System.out.print(a[j] + " ");
        }
        System.out.println("");
    }
    
    //Bubble sort array
    public void bubbleSort(){
        int out, in;
        //Out is equal to the number of passes N-1
        for(out=nElems-1; out>1; out--){
            for(in=0; in<out; in++){
                if(a[in] > a[in+1]){
                    //swapping 
                    long temp = a[in];
                    a[in] = a[in+1];
                    a[in+1] = temp;
                }
            }
        }
    }
    
}

//Main class
public class BubbleSortApp {
    public static void main(String[] args) throws Exception {
        int maxSize = 100;
        ArrayBub arr;
        arr = new ArrayBub(maxSize);
        
        //Insert elements
        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);
        
        //Display elements
        arr.display();
        
        //Sort elements
        arr.bubbleSort();
        
        //Display elements
        arr.display();
    }
}
