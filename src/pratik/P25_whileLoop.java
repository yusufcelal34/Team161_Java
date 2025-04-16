package pratik;

import java.util.Scanner;

public class P25_whileLoop {
    public static void main(String[] args) {

/*
    While döngü sayısı belli olmayan durumlarda kullanılır. Döngü başlangıcı ya da bitişi belli olmayan durumlarda kullanılır
    Bir koşul belirlenip o koşulun sağlanması durumuna göre hareket eder. Koşul hiç sağlanmazsa hiç çalışmaz

 */

// Kullanıcıdan bir kelime girmesini isteyip kelimenin içindeki
// indexi çift sayi olan karakterleri yazdiran bir code create ediniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz : ");
        String kelime = scan.next();

        int index = 0;

        while (index < kelime.length() - 1) {
            if (index % 2 == 0) {

                System.out.println(index + " .index : " + kelime.charAt(index));
            }
            index++;
        }

    }
}
