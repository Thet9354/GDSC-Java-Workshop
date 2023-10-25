package Topics.Basics;

public class DataTypes {
    public static void main(String[] args) {
        numbers();

        Booleans();

        Characters();
    }

    private static void Characters() {
        char myGrade = 'B';
        System.out.println(myGrade);

        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);

        String greeting = "Hello World";
        System.out.println(greeting);
    }

    private static void Booleans() {

        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);     // Outputs true
        System.out.println(isFishTasty);   // Outputs false
    }

    private static void numbers() {

        // Integer Types

        byte myByte = 100; // Bytes store whole numbers from -128 to 127
        System.out.println(myByte);

        short myShort = 5000; // Stores whole numbers from -32768 to 32767
        System.out.println(myShort);

        int myInt = 100000;
        System.out.println(myInt); // Stores whole numbers from -2147483648 to 2147483647

        long myLong = 15000000000L; // Stores whole numbers from -9223372036854775808 to 9223372036854775807
        System.out.println(myLong);

        float myFloat = 5.75f; // Numbers with decimals
        System.out.println(myFloat);

        double myNum = 19.99d; // Double example
        System.out.println(myNum);
    }

}
