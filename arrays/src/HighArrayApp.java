//Create class High Array
class HighArray{
    //Declare array and variable
    private long[] a;
    private int nElems;

    //Create array constructor
    public HighArray(int max){
        a = new long[max];
        nElems = 0;
    }

    //Find element
    public boolean find(long searchKey){
        int j;
        for(j=0; j<nElems; j++)
            if(a[j] == searchKey)
                break;
        if(j == nElems)
            return false;
        else
            return true;
    }

    //Insert element
    public void insert(long value){
        a[nElems] = value;
        nElems++;
    }

    //Delete element
    public boolean delete(long value){
        int j;
        for(j=0; j<nElems; j++)
            if(value == a[j])
                break;
        if(j == nElems)
            return false;
        else{
            for(int k=j; k<nElems; k++)
                a[k] = a[k+1];
            nElems--;
            return true;
        }
    }

    //Display array
    public void display(){
        for(int j=0; j<nElems; j++)
            System.out.print(a[j] + " ");
        System.out.println("");
    }
}

//Create driver class
public class HighArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;

        //Create object arr
        HighArray arr = new HighArray(maxSize);

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

        arr.display();

        //Search element 35
        int searchKey = 35;
        if(arr.find(searchKey)){
            System.out.println("Found " + searchKey);
        }else{
            System.out.println("Cant find " + searchKey);
        }
        //Delete elements
        arr.delete(00);
        arr.delete(55);
        arr.delete(99);

        arr.display();
    }
}
