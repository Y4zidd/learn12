public class whileLoop {
    public static void main(String[] args) {

        // perulangan while
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        // perulangan do-while
        int a = 1;
        do {
            System.out.println(a);
            a++;
        } while (a < 5);




        /*
           Penjelasalan :

           definisikan value dari for disini dimulai dari 1
           lalu buat pengulangan while (pengulangan ini berfungsi untuk megulang hingga nilainya 5, agar berhenti di else)
           lalu buat lagi pengulangan if dan else (buat outputan, jika belum sampai 5 dia akan terus mencatak hingga 5)
           program paling bawah berfungsi seperti i++, dia akan terus mencetak iterasi nya hingga 5 (perulangan nya)

        */


        int dor = 1;

        while (dor <= 5) {
            if (dor < 5) {
                System.out.println("Tarik Pelatuk");
            } else {
                System.out.println("Dor!!!");
            }
            dor = dor + 1;
        }
    }
}