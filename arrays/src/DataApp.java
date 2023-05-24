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

    //Display method
    public void displayPerson(){
        System.out.print(" Last name: " + lastName);
        System.out.print(", First name: " + firstName);
        System.out.println(", Age: " + age);
    }

    //Get last name
    public String getLast(){
        return lastName;
    }
}

//Class data array
class ClassDataArray{
    private Person[] a;
    private int nElems;

    //Constructor
    public ClassDataArray(int max){
        a = new Person[max];
        nElems = 0;
    }

    //Find method
    public Person find(String searchName){
        int j;
        for(j=0; j<nElems; j++)
            if(a[j].getLast().equals(searchName))
                break;
        if(j == nElems)
            return null;
        else
            return a[j];
    }

    //Insert method
    public void insert(String last, String first, int age){
        a[nElems] = new Person(last, first, age);
        nElems++;
    }

    //Delete method
    public boolean delete(String searchName){
        int j;
        for(j=0; j<nElems; j++)
            if(a[j].getLast().equals(searchName))
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

    //Display method
    public void displayA(){
        for(int j=0; j<nElems; j++)
            a[j].displayPerson();
    }
}

//Create driver class
class DataApp{
    public static void main(String[] args) {
        int maxSize = 100;

        //Create object arr
        ClassDataArray arr = new ClassDataArray(maxSize);

        //Insert elements
        arr.insert("Evans", "Patty", 24);
        arr.insert("Smith", "Lorraine", 37);
        arr.insert("Yee", "Tom", 43);
        arr.insert("Adams", "Henry", 63);
        arr.insert("Hashimoto", "Sato", 21);
        arr.insert("Stimson", "Henry", 29);
        arr.insert("Velasquez", "Jose", 72);
        arr.insert("Lamarque", "Henry", 54);
        arr.insert("Vang", "Minh", 22);
        arr.insert("Creswell", "Lucinda", 18);

        //Display elements
        arr.displayA();

        //Search for element
        String searchKey = "Stimson";
        Person found;
        found = arr.find(searchKey);
        if(found != null){
            System.out.print("Found ");
            found.displayPerson();
        }
        else
            System.out.println("Cant find " + searchKey);

        //Delete element
        System.out.println("Deleting Smith, Yee, and Creswell");
        arr.delete("Smith");
        arr.delete("Yee");
        arr.delete("Creswell");

        //Display elements
        arr.displayA();
    }
}
