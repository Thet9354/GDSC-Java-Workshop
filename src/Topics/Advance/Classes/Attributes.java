package Topics.Advance.Classes;

public class Attributes {
    int x = 5;
    int y = 3;

    public static void main(String[] args) {
        Attributes attr = new Attributes();
        System.out.println(attr.x); // Accessing Attributes
        attr.x = 40;
        System.out.println(attr.x);
    }
}

class MultipleAttributes {
    String fname = "James";
    String lname = "Bond";
    int age = 24;

    public static void main(String[] args) {
        MultipleAttributes multipleAttributes = new MultipleAttributes();
        System.out.println("Name: " + multipleAttributes.fname + " " + multipleAttributes.lname);
        System.out.println("Age: " + multipleAttributes.age);
    }
}
