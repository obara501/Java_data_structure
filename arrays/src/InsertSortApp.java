// Insertion sort
// With insertion sort, we start by placing elem at index 1 to a temp storage then compare elements to the left.
// If left element is greater, it is sfted to the right and repeat. 
// If left element is smaller, we insert the temp element at the current index.

class ArrayIns{
    private long[] a;
    private int nElems;
    
    //constructor
    public ArrayIns(int max){
        a = new long[max];
        nElems = 0;
    }
    
    //Insert elements
    public void insert(long value){
        a[nElems] = value;
        nElems++;
    }
    
    //Dsiplay elements
    public void display(){
        for(int j=0; j<nElems; j++){
            System.out.print(a[j] + " ");
        }
        System.out.println("");
    }
    
    //Bubble sort array
    public void insertionSort(){

        for(int i=1; i<nElems; i++){
            long temp = a[i];
            int j = i-1;

            while(j>=0 && a[j] > temp){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = temp;
        }
    }
}

//Main class
public class InsertSortApp {
    public static void main(String[] args) throws Exception {
        int maxSize = 100;
        ArrayIns arr;
        arr = new ArrayIns(maxSize);
        
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

        //Display array
        arr.display();

        //Bubble sort array
        arr.insertionSort();

        //Display array
        arr.display();
    }
}