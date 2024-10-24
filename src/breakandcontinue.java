public class breakandcontinue {

    /*
      Jika nilai i sama dengan 4 maka akan berhenti di 4 (4 tidak akan dicetak )
      yang di cetak hanya sampai 3 saja (1,2,3)
    */

    // break
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }

    /*
      jika nilainya sampai dengan 4 maka iterasi akan terus berlanjut hanya saja nilai dari 4 tidak akan di cetak / diskip
      yang di cetak hanya sampai 9 saja (1,2,3,5,6,7,8,9)
    */
        // continue
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }

        /*
           Sama saja seperti di atas hanya saja menggunakan perulangan while loop
        */

        //breaks while loop
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 4) {
                break;
            }
        }

        // continue while loop
        int p = 0;
        while (p < 10) {
            System.out.println(p);
            p++;
            if (p == 4) {
                continue;
            }
            System.out.println(p);
            p++;
        }
    }
}