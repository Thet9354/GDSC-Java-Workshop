package Topics.Basics;

public class Boolean {
    public static void main(String[] args) {

        // Boolean Values
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);     // Outputs true
        System.out.println(isFishTasty);   // Outputs false

        // Boolean Expression
        int x = 10;
        int y = 9;
        System.out.println(x > y); // returns true, because 10 is higher than 9

        // Real Life Examples
        int myAge = 25;
        int votingAge = 18;

        if (myAge >= votingAge) {
            System.out.println("Old enough to vote!");
        } else {
            System.out.println("Not old enough to vote.");
        }
    }
}
