//Create class LowArray

class LowArray{
    //Declare array
    private long[] a;
    //array constructor with array size as the parameter.
    public LowArray(int size){
        a = new long[size];
    }

    //set and get methods
    public void setElem(int index, long value){
        a[index] = value;
    }
    public long getElem(int index){
        return a[index];
    }
}

//Main class user app
public class LowArrayApp {
    public static void main(String[] args) throws Exception {
        //Instantiate LowArray object
        LowArray arr = new LowArray(100);
        int nElems = 0;
        int j;

        //Insert elements
        arr.setElem(0, 77);
        arr.setElem(1, 99);
        arr.setElem(2, 44);
        arr.setElem(3, 55);
        arr.setElem(4, 22);
        arr.setElem(5, 88);
        arr.setElem(6, 11);
        arr.setElem(7, 00);
        arr.setElem(8, 66);
        arr.setElem(9, 33);
        nElems = 10;

        //Display elements
        for(j=0; j<nElems; j++){
            System.out.print(arr.getElem(j) + " ");
        }
        System.out.println("");
        
        //Search for element 26
        int searchKey = 26;
        for(j=0; j<nElems; j++){
            if(arr.getElem(j) == searchKey){
                break;
            }
            if(j == nElems){
                System.out.println("Cant find "+ searchKey);
            }
        }

        //Find and Delete element 55
        for(j=0; j<nElems; j++){
            if(arr.getElem(j) == 55){
                break;
            }
        }

        //Delete element and move higher index elements up.
        for(int k=j; k<nElems; k++){
            arr.setElem(k, arr.getElem(k+1));
        }

        nElems--;

        //Display elements
        for(j=0; j<nElems; j++){
            System.out.print(arr.getElem(j) + " ");
        }

        System.out.println("");
    }
}
