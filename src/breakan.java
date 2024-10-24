public class breakan {
    public static void main(String[] args) {
        for (int x = 1; x <= 10; x++) {
            if (x == 6) {
                    System.out.print("");
                    continue;
            } else {
                System.out.println(x);
            }

            // break and while loop
            int a = 0;

            while (a < 10) {
                System.out.println(a);
                a++;
                if (a == 4) {
                    break;
                }
               }
            }
        }
    }