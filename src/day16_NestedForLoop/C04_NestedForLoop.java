package day16_NestedForLoop;

import java.util.Scanner;

public class C04_NestedForLoop {
    public static void main(String[] args) {

        // Kullanicidan bir String isteyin ve
        // String’i tersine cevirip tersMetin isminde bir variable'a kaydedin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");

        for (int i = 1; i <= 4; i++) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        for (int i = 1; i <= 4; i++) {
            System.out.print(2 * i + " ");
        }

        System.out.println(" ");
        for (int i = 1; i <= 4; i++) {
            System.out.print(4 * i + " ");
        }

        /*
            tek bir islem ile asagidaki sekli yazdirin
            1 2 3 4
            2 4 6 8
            3 6 9 12
            4 8 12 16
         */

        System.out.println("\n==========================");

        for (int i = 1; i <=4; i++) {
            for (int j = 1; j <=4 ; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println("");
        }


    }
}
