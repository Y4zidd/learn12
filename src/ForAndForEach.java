public class ForAndForEach {
    public static void main(String[] args) {
     //perulangan for

        /*

         1. buatlah terlebih dahulu value dari variable yang akan di eksekusi contoh i = 0
         2. lalu untuk statemant kedua yaitu definisikan kondisi sebelum kode blok berhenti di angka yang sudah di tentukan
         3. kondisi ketiga digunakan untuk selalu mencetak hasilnya sebelum nilainya lebih dari atau sama dengan 10

        */


        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        //nested loop
        for (int i = 1; i <= 2; i++) {
            System.out.println(i);

            for (int j = 1; j <= 3; j++) {
                System.out.println(j);
            }
        }

        //for-each
        String[] cars = {"lenovo", "MSI", "Asus", "Hp", "Zyrex"};
        for (String i : cars) { // jika menggunakan variable i dia hanya akan mencetak seluruh nilai yang ada di variable cars
            System.out.println(cars[1]); // bisa mencetak 1 1 secara terpisah tapi hanya harus menggunakan variable dari cars nya bukan i
            System.out.println(i); // bisa mencetak seluruh nilai tapi tidak bisa secara terpisah
        }
    }
}