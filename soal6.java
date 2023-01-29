/*  Nama    : Zahran Anugerah Rizqullah
    NIM     : 221524063
    Kelas   : 1B
*/

import java.math.BigInteger;
import java.util.Scanner;

public class soal6 {
    public static void main(String[] args) {
        BigInteger angka1, angka2;

        Scanner keyboard = new Scanner(System.in);

        angka1 = keyboard.nextBigInteger();
        angka2 = keyboard.nextBigInteger();
        keyboard.close();

        System.out.println(angka1.add(angka2));
        System.out.println(angka1.multiply(angka2));
    }
}