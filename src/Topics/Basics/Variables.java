package Topics.Basics;

public class Variables {
    public static void main(String[] args) {

        variables();

        PrintVariables();

        DeclareMultipleVariable();
    }

    private static void DeclareMultipleVariable() {

        // Declaring Many Variables
        int x = 5, y = 6, z = 50;
        System.out.println(x + y + z);

        // One value to Multiple Variable
        int a, b, c;
        a = b = c = 50;
        System.out.println(a + b + c);


    }

    private static void PrintVariables() {

        String name = "John";
        System.out.println("Hello " + name);

        String firstName = "John ";
        String lastName = "Doe";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        int x = 5;
        int y = 6;
        System.out.println(x + y); // Print the value of x + y
    }

    private static void variables() {
        String name = "John";
        System.out.println(name);

        int myNum = 15;
        System.out.println(myNum);

        int Num2; // Declare variables without assigned value
        Num2 = 15;
        System.out.println(Num2);

        int Num3 = 15;
        Num3 = 20;  // myNum is now 20
        System.out.println(Num3);

//        final int finalNum = 15;
//        finalNum = 20; // will generate an error: cannot assign a value to a final variable

        // Other types
        int myInt = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";
    }
}
