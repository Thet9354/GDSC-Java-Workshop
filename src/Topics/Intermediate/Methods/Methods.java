package Topics.Intermediate.Methods;

public class Methods {
    static void joke() {
        System.out.println("I just got executed");
    }

    public static void main(String[] args) {
        joke();
        joke();
        joke();
        joke(); // Can be called multiple times
    }
}
