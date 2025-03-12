package mEmre_Odev;

import java.util.Scanner;

public class mEmre_Odev2 {
    public static void main(String[] args) {

//        1 den 20 ye kadar tam sayıları alt alta yazan Java kodu yazınız.
//        Hint: For döngüsü kullanınız.
//        Beklenen Çıktı:

//        1
//        2
//        3
//        4
//        .
//        .
//        .
//        19
//        20

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir tam sayi giriniz...");

        int sayi = scanner.nextInt();

        System.out.println(sayi + " Sayısını");

        for (int i = 1; i <= sayi; i++) {
            System.out.println(i);
        }


    }
}
