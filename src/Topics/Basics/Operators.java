package Topics.Basics;

public class Operators {
    public static void main(String[] args) {

        int sum1 = 100 + 50;        // 150 (100 + 50)
        int sum2 = sum1 + 250;      // 400 (150 + 250)
        int sum3 = sum2 + sum2;     // 800 (400 + 400)

        // Arithmetic Operators
        int x = 5;
        int y = 3;
        System.out.println(x + y);

        System.out.println(x - y);

        System.out.println(x * y);

        System.out.println(x / y);

        System.out.println(x % y);

        System.out.println(++x);

        System.out.println(--x);

        // Java Assignment Operators
        System.out.println(x += 3);

        System.out.println(x -= 3);

        System.out.println(x *= 3);

        System.out.println(x /= 3);

        System.out.println(x %= 3);

        System.out.println(x &= 3);

        System.out.println(x |= 3);

        System.out.println(x ^= 3);

        System.out.println(x >>= 3);

        System.out.println(x <<= 3);

        // Java Comparison Operators
        System.out.println(x == y);

        System.out.println(x != y);

        System.out.println(x > y);

        System.out.println(x < y);

        System.out.println(x >= y);

        System.out.println(x <= y);

        // Java Logical Operators
        System.out.println(x < 5 &&  x < 10);

        System.out.println(x < 5 || x < 4);

        System.out.println(!(x < 5 && x < 10));

    }
}
