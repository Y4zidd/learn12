public class assigmentoperator {
    public static void main(String[] args) {
        // definition
        int x, y;

        x = 10;
        System.out.println(x);

        // assignment +
        y = 12;
        y += 10;
        System.out.println(y);

        // assignment -
        y = 3;
        y -= 10;
        System.out.println(y);

        // assignment x
        y = 3;
        y *= 10;
        System.out.println(y);

        // assignment /
        y = 9;
        y /= 3;
        System.out.println(y);

        // assignment %
        y = 3;
        y %= 10;
        System.out.println(y);

        // assignment & (bitwise)
        y = 5;
        y &= 3;
        System.out.println(y);

        // assignment | (or bitwise)
        y = 5;
        y |= 3;
        System.out.println(y);

        // assignment ^ (xor bitwise)
        y = 5;
        y ^= 3;
        System.out.println(y);

        // assignment >> (right shift assignment)
        y = 8;
        y >>= 2;
        System.out.println(y);

        // assignment << (left shift assignment)
        y = 8;
        y <<= 2;
        System.out.println(y);
    }
}