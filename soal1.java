/*  Nama    : Zahran Anugerah Rizqullah
    NIM     : 221524063
    Kelas   : 1B
*/

import java.util.Scanner;

public class soal1 {
    public static void main(String args[]) {
        String input;
        String stop = " !,?.'_@";
        int jumlahHuruf, jumlahKata = 0, counter = 0;
        int[] flag = new int[400000];

        Scanner keyboard = new Scanner(System.in);
        input = keyboard.nextLine();
        keyboard.close();

        jumlahHuruf = input.length();
        for (int i = 0; i < jumlahHuruf; i++) {
            for (int j = 0; j < 8; j++) {
                if (input.charAt(i) == stop.charAt(j)) {
                    flag[jumlahKata] = i;
                    jumlahKata++;
                }
            }
        }

        System.out.println(jumlahKata + 1);
        for (int i = 0; i < jumlahHuruf; i++) {
            if (i == flag[counter]) {
                System.out.println();
                counter++;
            } else {
                System.out.print(input.charAt(i));
            }
        }
    }
}