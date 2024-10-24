public  class javaLogicalOperator {
    public static void main(String[] args) {
        int x, y;
        boolean b, c, d;

        // AND operator (&&) (true)
        x = 2;
        y = 4;

        b = x > 1 && y < 5;
        System.out.println(b);

        // AND operator (&&) (false)
        x = 0;
        y = x;

        b = x > 1 && y < 5;
        System.out.println(b);

        // OR operator (||) (true)
        x = 2;
        y = 8;

        c = x > 1 && y > 7;
        System.out.println(c);

        // OR operator (||) (false)
        x = 2;
        y = 8;

        c = x > 1 && y < 7;
        System.out.println(c);

        // not (return true if result false)
        x = 2;
        y = 8;

        d = !(y > x);

        System.out.println(d);

        // not (return false if result true)
        x = 2;
        y = 8;

        d = !(y < x);

        System.out.println(d);
    }
}