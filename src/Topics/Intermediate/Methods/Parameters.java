package Topics.Intermediate.Methods;

public class Parameters {
    public static void main(String[] args) {
        myMethod("Thet");
        nameAge("Frederick", 23);
        nameAge("Thet Pine", 19);
    }

    private static void nameAge(String name, int age) {
        System.out.println(name + " is " + age + " years old ");
    }

    private static void myMethod(String firstName) { // Single parameter and argument
        System.out.println(firstName + " Pine");
    }


}
