package PracticeLessons;

import java.util.Scanner;

public class C05_DataCasting
{
    private static String sonuc;

    public static void main(String[] args)
    {
       Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen iki adet ondalıklı sayı giriniz. ");
        System.out.print("1. Sayı Giriniz: ");
        double sayi1 = scan.nextDouble();

        System.out.print("2. sayı Giriniz: ");
        double sayi2 = scan.nextDouble();

        int sonuc = (int) (sayi1 / sayi2);
        System.out.println("Sonuç: " + sonuc);

    }
}

