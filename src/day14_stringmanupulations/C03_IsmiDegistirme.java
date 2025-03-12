package day14_stringmanupulations;

import java.util.Scanner;

public class C03_IsmiDegistirme {
    public static void main(String[] args) {

        // Kullanicidan ismini, soyismini ve 16 haneli kredi karti numarasini alin
        // bilgileri asagidaki gibi yazdirin
        // Girilen isim-soyisim : C** D****,
        // Kredi kart numarasi  : **** **** **** 4567

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adinizi giriniz");
        String ad = scanner.nextLine();
        System.out.println("Soyadinizi giriniz");
        String soy = scanner.nextLine();
        System.out.println("16 haneli kredi karti numaraniz");
        String kart = scanner.nextLine();

        System.out.println("İsim Soyisim : " +
                        ad.substring(0, 1).toUpperCase()
                        + ad.substring(1).replaceAll("\\w", "*")
                        + " " +
                        soy.substring(0, 1).toUpperCase()
                        + soy.substring(1).replaceAll("\\w", "*") + "\n");

                System.out.println("Kredi karti no  : **** **** **** " + kart.substring(kart.length() -4));

    }
}