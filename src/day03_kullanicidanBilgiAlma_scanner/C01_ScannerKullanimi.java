package day03_kullanicidanBilgiAlma_scanner;

import java.util.Scanner;

public class C01_ScannerKullanimi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir tam sayi giriniz");

        int girilenSayi = scanner.nextInt();

        System.out.println("Girilen sayinin 10 kati : "+ girilenSayi * 10);
    }
}
