package day03_kullanicidanBilgiAlma_scanner;

import java.util.Scanner;

public class C03_KullaniciBilgileriniYazdirma {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
                System.out.print("Lutfen isminizi giriniz: ");
                String isim = scanner.nextLine();

                System.out.print("Lutfen soyadinizi giriniz:");
                String soyadin = scanner.nextLine();

                System.out.println("Lutfen yasinizi giriniz:");
                int yas = scanner.nextInt();

        System.out.println( "Ismiminiz : " + isim +
                            "\nSoyadiniz : " + soyadin +
                            "\nYasiniz : " + yas +
                            "\nKaydiniz basariyla kaydedildi : "

        );
    }
    }
