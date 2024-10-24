import java.util.Scanner;

public class Math {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        hasilya(input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input);

    }

    public static void hasilya(String masukanNilai, String masukanNilai2, String MasukanNilai3, String MasukanNilai4, Scanner input) {

        String totalnya = masukanNilai + masukanNilai2 + MasukanNilai3 + MasukanNilai4;

        if (totalnya == totalnya) {
            int masukanNilai1 = Integer.parseInt(masukanNilai);
            int masukanNilai23 = Integer.parseInt(masukanNilai2);
            int masukanNilai33 = Integer.parseInt(MasukanNilai3);
            int masukanNilai43 = Integer.parseInt(MasukanNilai4);

            int hasil1 = masukanNilai1 + 5;
            int hasil2 = masukanNilai23 + 5;
            int hasil3 = masukanNilai33 + 5;
            int hasil4 = masukanNilai43 + 5;

            if (hasil1 >= 9) {
                hasil1 -= 10;
                if (hasil1 <= 0) {
                    hasil1 += 10;
                }
                int hasilan1 = hasil1;
            } else {
                int hasilan1e = hasil1;
            }

            if (hasil2 >= 9) {
                hasil2 -= 10;
                if (hasil2 <= 0) {
                    hasil2 += 10;
                }
                int hasilan2 = hasil2;
            } else {
                int hasilan2e = hasil2;
            }

            if (hasil3 >= 9) {
                hasil3 -= 10;
                if (hasil3 <= 0) {
                    hasil3 += 10;
                }
                int hasilan3 = hasil3;
            } else {
                int hasilan3e = hasil3;
            }

            if (hasil4 >= 9) {
                hasil4 -= 10;
                if (hasil4 <= 0) {
                    hasil4 += 10;
                }
                int hasilan4 = hasil4;
            } else {
                int hasilan4e = hasil4;
            }

            System.out.println(hasil1 + "" + hasil4 + "" + hasil3 + "" + hasil2);
        }


    }
}

