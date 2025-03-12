package day16_NestedForLoop;

import java.util.Scanner;

public class C01_ArdisikKarakterleriYazma {
    public static void main(String[] args) {

        // Kullanicidan bir karakter girmesini isteyin
        // Kullanici kucuk harf girerse, girilen harf ve sonraki 5 karakteri yazdirin
        // Kullanici buyuk harf girerse, girilen harf ve sonraki 4 karakteri yazdirin
        // Kullanici baska bir karakter girerse girilen karakter ve sonraki 3 karakteri yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz...");
        char karakter = scanner.next().charAt(0);


        if (Character.isLowerCase(karakter)) {
            // Küçük harf
//            for (int i = 0; i < 5; i++) {
//                System.out.print((char) (karakter + i));
//            }
            for (char i = karakter; i <= karakter + 5; i++) {
                System.out.print((i + " "));
            }



        } else if (Character.isUpperCase(karakter)) {
            // Büyük harf
            for (char i = karakter; i <= karakter + 4; i++) {
                System.out.print((i + " "));
            }

        } else {
            // Diğer karakterler bölümü
            for (char i = karakter; i <= karakter + 3; i++) {
                System.out.print((i + " "));
            }

        }

    }
}
