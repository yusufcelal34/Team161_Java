package mEmre_Odev;

import java.util.Scanner;

public class mEmre_Odev7 {
    public static void main(String[] args) {
    /*7-----
    Ugly Number:

    Girilen bir sayının  ugly number olup olmadığını kontrol etmek için bir Java programı yazın.
    Sayı sisteminde,  ugly number  sadece asal faktörleri carpanlari 2, 3 veya 5 olan pozitif sayılardan olusur...
    İlk 10  ugly number 1, 2, 3, 4, 5, 6, 8, 9, 10, 12'dir. Kural olarak, 1 dahil.

    Test Data:  13

    Beklenen çıktı: ugly number  degildir

    Test Data:  25
    Beklenen Çıktı: ugly number

    */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi giriniz");
        int sayi = scanner.nextInt();

        if (sayi == 1 || sayi %2 == 0 || sayi %3== 0 || sayi %4== 0) {
            System.out.println("Bu "+sayi +" syısı Ugly sayısıdir");
        }else {
            System.out.println("Ugly kodu degil");
        }

    }
}
