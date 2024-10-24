public class forloop {
    public static void main(String[] args) {

        // for loop
        for (int x = 1; x < 10; x++) {
            System.out.println(x);
        }

        //  for loop ganjil

        /*
        disini x di definisikan dengan x + 2 (artinya disini setiap iterasi nilai x di tambahkan 2 (3,5,7,9) hingga kurang dari 10)
        */

        for (int x = 1; x < 10;x = x + 2) {
            System.out.println(x);
        }

        /*

        nested loop ini akan mengulang sesuai nilai di dalam iterasi for (di dalam for masih ada for)

        loop pertama itu disebut for luar
        loop kedua disebut for dalam

        loop pertama akan dicetak sesuai nilai yang sudah di tentukan hingga berapa

        misal anda memberi nilai variable 0 lalu perulangan akan di lakukan hingga nilai nya sama dengan 3
        maka anda akan mengulang sebanyak 4 kali (yaitu 0, 1, 2, 3)

        nilai dari loop kedua (dalam akan menysisip di setiap perulanagan nya)

        misal anda memberi nilai variable nya 0 lalu perulangan akan di lakukana hingga nilai nya sama dengan 4
        maka anda akan mengulana sebanyak 5 kali (yaitu 0, 1, 2, 3, 4)
        lalu setiapa iterasinya akan disisipkan di setiap perulangan iterasi luar nya

        contoh :

        iterasi luar : 1
        iterasi dalam : 0
        iterasi dalam : 1
        iterasi dalam : 2
        iterasi dalam : 3
        iterasi dalam : 4

         */
        // nested looop
        for (int x = 0; x <= 3; x++ ){
            System.out.println("luar " + x);

            for (int y = 0; y <= 4; y++) {
                System.out.println("dalam " + y);
            }
        }

        //for each loop bisa mengakses loop melalui data array

        String[] cars = {"Honda", "Supra", "Avanza", "Tesla"};
        for (String i : cars) {
            System.out.println(i);
        }

        // contoh perkalian 4 hanya dengan 3 line
        int x = 4;

        for (int y = 1; y <= 10; y++){
            System.out.println(x + " x " + y + " = " + (x * y));
        }


    }
}