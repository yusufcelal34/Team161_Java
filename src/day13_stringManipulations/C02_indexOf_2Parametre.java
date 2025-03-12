package day13_stringManipulations;

import java.util.Scanner;

public class C02_indexOf_2Parametre {
    public static void main(String[] args) {
/*
    verilen str'da aranan char veya metnin HANGI INDEX'de oldugu bilgisini getirir
    eger aranan char veya metin str'da birden fazla varsa ilkinin index'ini geitirir.
 */

        String str = "Java cok guzel";

        System.out.println(str.contains("cok"));
        System.out.println(str.startsWith("cok"));
        System.out.println(str.endsWith("cok"));
        System.out.println(str.equals("cok"));

        // Peki bu cok nerede
        System.out.println(str.indexOf("cok"));
        // "cok" kelimesi str icinde 5. index'den itibaren var

        System.out.println(str.indexOf("a"));

        str = "Ali topu at, at Ali at";
        System.out.println(str.indexOf("at"));
        System.out.println(str.indexOf("Ali"));
        System.out.println(str.indexOf("a"));

        System.out.println(str.indexOf("k"));
        System.out.println(str.contains("k"));

        //Kullanicidan bir metin isteyin metni Java icerip icermedigini index of'dan faydalanarak yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");
        String metin = scanner.nextLine();

        if ( metin.indexOf("Java") != -1  ){
            System.out.println("Yazilan metin Java iceriyor...");
        } else {
            System.out.println("Yazilan metin Java icermiyor...");
        }

    }
}
