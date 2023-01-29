/*  Nama    : Zahran Anugerah Rizqullah
    NIM     : 221524063
    Kelas   : 1B
*/

import java.util.Scanner;

public class soal5 {
    public static void main(String[] args) {
        String[] input = new String[4];
        String gabungan;
        Long angka;
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            input[i] = keyboard.next();
        }
        keyboard.close();
        gabungan = input[0] + input[1] + input[2] + input[3];
        angka = Long.parseLong(gabungan);
        if ((angka - 999999) % 5 == 1) {
            System.out.println("berhenti");
        } else {
            System.out.println("jalan");
        }
    }
}