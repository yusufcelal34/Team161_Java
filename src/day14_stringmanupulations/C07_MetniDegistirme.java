package day14_stringmanupulations;

import java.util.Scanner;

public class C07_MetniDegistirme {
    public static void main(String[] args) {

        //  Kullanicidan bir String alin,
        //  String’in uzunlugu cift sayi ise tam ortasina :) ekleyin,
        //  String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :disappointed: yazdirin.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir metin giriniz...");
        String metin = scanner.nextLine();

        int uzunluk = metin.length();

        if (uzunluk % 2 == 0) {

            System.out.println(
                    metin.substring(0, uzunluk / 2)
                    + ":)"+
                    metin.substring(uzunluk / 2));

        } else {

            System.out.println(
                    metin.substring(0, uzunluk / 2)
                    + ":("+
                    metin.substring(uzunluk / 2+1));

        } ;


    }
}
