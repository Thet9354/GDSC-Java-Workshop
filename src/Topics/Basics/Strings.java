package Topics.Basics;

public class Strings {
    public static void main(String[] args) {

        String txt = "Hello World";
        System.out.println("The length of the txt string is: " + txt.length()); // Prints out length of a string
        System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD", makes it all caps
        System.out.println(txt.toLowerCase());   // Outputs "hello world", makes it all lower case


        String locate = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate")); // Outputs 7

        Concatenation();
    }

    private static void Concatenation() {
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.concat(lastName)); // Concat() method to concat 2 strings together
    }
}
