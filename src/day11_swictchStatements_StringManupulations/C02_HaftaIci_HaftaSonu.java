package day11_swictchStatements_StringManupulations;

import java.util.Scanner;

public class C02_HaftaIci_HaftaSonu {
    public static void main(String[] args) {

        // Kullanicidan gun numarasi girmesini isteyin
        // girilen sayiya gore 1- pazartesi ..... 7 - pazar olacak sekilde
        // istenen gunun hafta ici veya hafta sonu oldugunu yazdirin
        // kullanici 1-7 arasindaki sayilar disinda bir deger girerse
        // hata mesaji verin


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen gün numarasini giriniz...");
        int gunNo = scan.nextInt();

        switch (gunNo) {
            case 1:
                System.out.println("Hafta ici");
                break;
            case 2:
                System.out.println("Hafta ici");
                break;
            case 3:
                System.out.println("Hafta ici");
                break;
            case 4:
                System.out.println("Hafta ici");
                break;
            case 5:
                System.out.println("Hafta ici");
                break;
            case 6:
                System.out.println("Hafta sonu");
                break;
            case 7:
                System.out.println("hafta sonu");
                break;
            default:
                System.out.println("Girilen gun numarası yanlış");

        }
    }
}
