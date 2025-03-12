package day16_NestedForLoop;

import java.util.Scanner;

public class C02_StringTerstenYazdirma {
    public static void main(String[] args) {

        // Kullanicidan bir String isteyin ve String’i tersten yazdirin.
        // orn input : Sabri output : irbaS

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir metin giriniz: ");
        String metin = scanner.nextLine();

        String tersMetin = new StringBuilder(metin).reverse().toString();
        System.out.println("Girilen metnin tersten yazılışı: " + tersMetin);

        scanner.close();

    }
}
