package day03_kullanicidanBilgiAlma_scanner;

import java.util.Scanner;

public class C05_KullaniciBilgileriniYazdirma {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen isminizi giriniz: ");
        char isim = scanner.nextLine().charAt(0);

        System.out.print("Lutfen soyadinizi giriniz:");
        String soyadin = scanner.nextLine();

        System.out.println("Lutfen yasinizi giriniz");
        int yas = scanner.nextInt();


        System.out.println( "Ismiminiz : " + isim +"*****"+
                "\nSoyadiniz : " + soyadin +
                "\nYasiniz : " + yas +
                "\nKaydiniz basariyla kaydedildi : ");


    }
}
