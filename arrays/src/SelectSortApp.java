//Selection Sort

class ArraySel{
    private long[] a;
    private int nElems;
    
    //Constructor
    public ArraySel(int max){
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
    
    //Select sort array
    public void selectionSort(){
        int out, in, min;
        
        for(out=0; out<nElems-1; out++){
            min = out;
            for(in=out+1; in<nElems; in++){
                if(a[in] < a[min]){
                    min = in;
                }
            }
            //swapping
            long temp = a[out];
            a[out] = a[min];
            a[min] = temp;
        }
    } 
}

//Main class
public class SelectSortApp {
    public static void main(String[] args) throws Exception {
        int maxSize = 100;
        ArraySel arr;
        arr = new ArraySel(maxSize);
        
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
        
        //Selection sort array
        arr.selectionSort();
        
        //Display array
        arr.display();
    }
}