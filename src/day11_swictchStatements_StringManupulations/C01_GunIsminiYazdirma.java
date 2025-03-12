package day11_swictchStatements_StringManupulations;

import java.util.Scanner;

public class C01_GunIsminiYazdirma {
    public static void main(String[] args) {
        // Kullanicidan gun numarasi girmesini isteyin
        // girilen sayiya gore 1- pazartesi ..... 7 - pazar olacak sekilde
        // gun ismini yazdirin
        // kullanici 1-7 arasindaki sayilar disinda bir sayi girerse
        // hata mesaji verin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen gun numarasını giriniz...");
        int gunNo = scanner.nextInt();

        if (gunNo == 1) {
            System.out.println("Pazartesi");
        } else if (gunNo == 2) {
            System.out.println("Salı");
        } else if (gunNo == 3) {
            System.out.println("Çarşamba");
        } else if (gunNo == 4) {
            System.out.println("Perşembe");
        } else if (gunNo == 5) {
            System.out.println("Cuma");
        } else if (gunNo == 6) {
            System.out.println("Cumartesi");
        } else if (gunNo == 7) {
            System.out.println("Pazar");
        } else System.out.println("Girilen gun numarası yanlış ");

        System.out.println("*****************************");
        // ayni islemi switch ile yapalim
        switch (gunNo) {
            case 1 :
                System.out.println("Pazartesi");
                break;
            case 2 :
                System.out.println("Salı");
                break;
            case 3 :
                System.out.println("Çarşamba");
                break;
            case 4 :
                System.out.println("Perşembe");
                break;
            case 5 :
                System.out.println("Cuma");
                break;
            case 6 :
                System.out.println("Cumartesi");
                break;
            case 7 :
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Girilen gun numarası yanlış");
                break;
        }
    }
}
