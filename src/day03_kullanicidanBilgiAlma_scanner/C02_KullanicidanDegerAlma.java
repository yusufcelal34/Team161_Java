package day03_kullanicidanBilgiAlma_scanner;

import java.util.Scanner;

public class C02_KullanicidanDegerAlma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir ondalikli sayi giriniz :");
        double girilenOndalikliSayi = scanner.nextDouble();

        System.out.println("Lutfen bir tam sayi giriniz :");
        int girilentamSayi = scanner.nextInt();

        System.out.println("Girilen sayilarin toplami :" + (girilenOndalikliSayi + girilentamSayi));
        System.out.println("Girilen sayilarin carpimi :"+ (girilenOndalikliSayi * girilentamSayi));

    }
}
