/*  Nama    : Zahran Anugerah Rizqullah
    NIM     : 221524063
    Kelas   : 1B
*/

import java.util.Scanner;

public class soal2 {

    public static void main(String[] args) {
        String[] input = new String[3], angka = new String[3];
        int i, j, k;

        Scanner keyboard = new Scanner (System.in);
        for (i = 0; i < 3; i++) {
            input[i] = keyboard.nextLine();
            angka[i] = input[i].split(" ")[1];
            input[i] = input[i].split(" ")[0];
        }
        keyboard.close();
        System.out.println("================================");
        for (i = 0; i < 3; i++) {
            System.out.print(input[i]);
            for (j = 0; j < (15 - input[i].length()); j++) {
                System.out.print(" ");
            }
            if (angka[i].length() < 3) {
                for (k = 0; k < (3 - angka[i].length()); k++) {
                    System.out.print("0");
                }
                System.out.println(angka[i]);
            } else {
                System.out.println(angka[i]);
            }
        }
        System.out.println("================================");

    }
}