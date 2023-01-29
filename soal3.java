/*  Nama    : Zahran Anugerah Rizqullah
    NIM     : 221524063
    Kelas   : 1B
*/

import java.util.Scanner;

public class soal3 {

    public static void main(String[] args) {
        int angka1, angka2, hasil = 0;
        String operasi;

        Scanner keyboard = new Scanner(System.in);

        angka1 = keyboard.nextInt();
        operasi = keyboard.next();
        angka2 = keyboard.nextInt();
        keyboard.close();

        if (operasi.charAt(0) == '+') {
            hasil = angka1 + angka2;
        } else if (operasi.charAt(0) == '-') {
            hasil = angka1 - angka2;
        } else if (operasi.charAt(0) == '*') {
            hasil = angka1 * angka2;
        } else if (operasi.charAt(0) == '/') {
            hasil = angka1 / angka2;
        } else if (operasi.charAt(0) == '%') {
            hasil = angka1 % angka2;
        }

        System.out.print(hasil);
    }
}