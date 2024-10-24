import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        int x, yb, y , z;

        // if else operation

        Scanner InputX = new Scanner(System.in);
        System.out.print("Masukan Nilai dari x : ");

        x = InputX.nextInt();

        yb = 2 * x + 10;

        y = 4;

        if (x < y) {
            System.out.println(yb);
        } else {
            System.out.println(y);
        }

        // if else operations
        int a, b, c, d;

        a = 85;
        b = 75;
        c = 65;
        d = 50;

        if (a >= b) {
            System.out.println("A");
        } else if (b >= c) {
            System.out.println("B");
        } else if (c >= d) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }

        {

        }

    }
}