package Topics.Advance.Classes;

public class Constructor {
    int x; // Class attribute

    public Constructor() {
        x = 5; // Setting initial value for the class attribute
    }

    public static void main(String[] args) {
        Constructor constructor = new Constructor(); // Create an object of class Main (This will call the constructor)
        System.out.println(constructor.x); // Print the value of x
    }

}
