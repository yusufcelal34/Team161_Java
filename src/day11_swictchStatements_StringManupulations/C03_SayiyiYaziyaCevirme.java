package day11_swictchStatements_StringManupulations;

import java.util.Scanner;

public class C03_SayiyiYaziyaCevirme {
    public static void main(String[] args) {

        // kullanicidan bir rakam isteyin
        // girilen rakami yazi ile yazdirin
        // orn input : 7 , output : yedi
        // 0-9 arasindaki sayilar disinda sayi yazarsa hata mesaji verin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Tam bir sayi giriniz: ");
        int sayi = scanner.nextInt();
        switch (sayi) {
            case 0:
                System.out.println("Sıfır");
                break;
            case 1:
                System.out.println("Bir");
                break;
            case 2:
                System.out.println("İki");
                break;
            case 3:
                System.out.println("Üç");
                break;
            case 4:
                System.out.println("Dört");
                break;
            case 5:
                System.out.println("Beş");
                break;
            case 6:
                System.out.println("Altı");
                break;
            case 7:
                System.out.println("Yedi");
                break;
            case 8:
                System.out.println("Sekiz");
                break;
            case 9:
                System.out.println("Dokuz");
                break;
            default:
                System.out.println("0 ve 9 sayı aralığında bir sayı girmediniz");

        }
    }
}
