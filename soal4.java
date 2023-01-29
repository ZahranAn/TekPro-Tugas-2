/*  Nama    : Zahran Anugerah Rizqullah
    NIM     : 221524063
    Kelas   : 1B
*/

import java.util.Scanner;

public class soal4 {

    public static void main(String[] args) {
        int gaji = 500000;
        int hargaItem = 50000;
        int item, hasil = 0;

        Scanner sc = new Scanner(System.in);

        item = sc.nextInt();
        sc.close();

        hasil = (item < 15) ? gaji - ((((15 - item) * hargaItem) * 15) / 100)
                : (item >= 40) ? gaji + (((hargaItem * 25) / 100) * item)
                        : (item > 80) ? gaji + (((hargaItem * 35) / 100) * item)
                                : gaji + (((hargaItem * 10) / 100) * item);

        System.out.println(hasil);
    }
}