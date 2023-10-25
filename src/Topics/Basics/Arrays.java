package Topics.Basics;

public class Arrays {
    public static void main(String[] args) {

        Array();

        LoopThroughArrays();

    }

    private static void LoopThroughArrays() {

        // Loop Through an Array
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        // Loop Through an Array with For-Each
        for (String i : cars) {
            System.out.println(i);
        }

    }

    private static void Array() {

        // Arrays
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"}; // an array of string values
        int[] myNum = {10, 20, 30, 40}; // an array of integer values

        // Access the Elements of an Array
        System.out.println(cars[0]);

        // Change an Array Element
        cars[0] = "Opel";
        System.out.println(cars[0]);

        // Array Length
        System.out.println(cars.length); // Outputs 4

    }
}
