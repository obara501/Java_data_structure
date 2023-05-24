//Create class person

class Person{

    private String lastName;
    private String firstName;
    private int age;

    //Constructor
    public Person(String last, String first, int a){
        lastName = last;
        firstName = first;
        age = a;
    }

    //Dsiplay method
    public void displayPerson(){
        System.out.print(" Last name: " + lastName);
        System.out.print(", First name: " + firstName);
        System.out.println(", Age: " + age);
    }

    //Get last name method
    public String getLast(){ // get last name
        return lastName;
    }
}

//Create array of people. 
class ArrayInOb{
    
    private Person[] a;
    private int nElems;
    
    //Constructor
    public ArrayInOb(int max){
        a = new Person[max];
        nElems = 0;
    }
    
    //Insert method
    public void insert(String last, String first, int age){
        a[nElems] = new Person(last, first, age);
        nElems++;
    }
    
    //Display method
    public void display(){
        for(int i = 0; i < nElems; i++){
            a[i].displayPerson();
        }
        System.out.println("");
    }
    
    //Insertion sort method
    public void insertionSort(){
        int in, out;
    
        for(out = 1; out < nElems; out++){
            Person temp = a[out];
            in = out;
            while(in > 0 && a[in-1].getLast().compareTo(temp.getLast()) > 0){
                a[in] = a[in-1];
                --in;
            }
            a[in] = temp;
        }
    }
}

class ObjectSortApp {
    public static void main(String[] args) {
        
        int maxSize = 100;
        ArrayInOb arr;
        arr = new ArrayInOb(maxSize);
        
        //Insert elements
        arr.insert("Evans", "Patty", 24);
        arr.insert("Smith", "Doc", 59);
        arr.insert("Smith", "Lorraine", 37);
        arr.insert("Smith", "Paul", 37);
        arr.insert("Yee", "Tom", 43);
        arr.insert("Hashimoto", "Sato", 21);
        arr.insert("Stimson", "Henry", 29);
        arr.insert("Velasquez", "Jose", 72);
        arr.insert("Vang", "Minh", 22);
        arr.insert("Creswell", "Lucinda", 18);
        
        //Display array
        System.out.println("Before sorting: ");
        arr.display();
        
        //Sort array
        arr.insertionSort();
        
        //Display array
        System.out.println("After sorting: ");
        arr.display();
    }
}
