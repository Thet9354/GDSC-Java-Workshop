package Topics.Advance.Classes;
import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        cars.get(0); // Access an item of an array
        cars.set(0, "Opel"); // Modify an element of the arraylist
        cars.remove(0); // Removing an element
        cars.clear(); // Remove all elements
        cars.size(); // Gets the size
    }
}
