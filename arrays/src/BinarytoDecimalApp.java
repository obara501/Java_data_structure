class BintoDec{

    private int[] a;
    private int nElems;

    //constructor
    public BintoDec(int max){
        a = new int[max];
        nElems = 0;
    }

    //insert method
    public void insert(int value){
        a[nElems] = value;
        nElems++;
    }

    //display method
    public void display(){
        for(int i = 0; i < nElems; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }

    //Convert binary array to decimal
    public void convert(){
        int dec = 0;
        int pow = nElems-1;
        for(int i = 0; i < nElems; i++){
            dec = dec + a[i] * (int)Math.pow(2, pow);
            pow--;
        }
        System.out.println("Decimal value is " + dec);
    }
}

public class BinarytoDecimalApp{
    public static void main(String[] args) {
        int maxSize = 100;
        BintoDec arr = new BintoDec(maxSize);

        //Insert binary digits
        arr.insert(1);
        arr.insert(0);
        arr.insert(0);
        arr.insert(1);
        arr.insert(1);
        arr.insert(0);
        arr.insert(0);
        arr.insert(1);

        arr.display();
        arr.convert();
    }
}
