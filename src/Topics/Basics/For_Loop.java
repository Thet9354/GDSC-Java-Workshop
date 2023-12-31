package Topics.Basics;

public class For_Loop {
    public static void main(String[] args) {

        // For Loop
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }



        // Nested loops
        // Outer loop
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer: " + i); // Executes 2 times

            // Inner loop
            for (int j = 1; j <= 3; j++) {
                System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
            }
        }


        // For-Each Loop
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
