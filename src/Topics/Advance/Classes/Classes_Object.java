package Topics.Advance.Classes;

public class Classes_Object {
    int x = 5;

    public static void main(String[] args) { // Creating an object
        Classes_Object myObj1 = new Classes_Object();
        Classes_Object myObj2 = new Classes_Object(); // Creating multiple objects of one class
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
    }
}

class Second {
    public static void main(String[] args) {
        Classes_Object myObj = new Classes_Object();
        System.out.println(myObj.x);
    }
}
