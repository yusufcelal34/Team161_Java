package day09_ifElseIfStatements_nestedIfElse;

import javax.xml.transform.Source;
import java.util.Scanner;

public class C03_IndirimliFiyatHesaplama {
    public static void main(String[] args) {

        // Kullaniciya kac adet urun aldigini ve bir urunun fiyatini sorun
        // eger kullanici 100 adet veya daha fazla aldiysa %25,
        // eger 50 adet veya daha fazla aldiysa %20
        // eger 10 adet veya daha fazla aldiysa %10 indirim yaparak
        // odeyecegi toplam miktari yazdirin
        // Kullanici negatif bir fiyat veya adet girerse uyari verin


        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç adet ürün aldınız ");
        int adet = scanner.nextInt();

        System.out.print("Ürün fiyatı ");
        double fiyat = scanner.nextDouble();

        double toplamTutar = adet * fiyat;
        double indirim = 0;

        if (adet < 0 || fiyat < 0) System.out.println("Pozitif olmali");

        else {

            if (adet >= 100) System.out.println("İndirim " + (indirim = 0.25));
            else if (adet >= 50) System.out.println("İndirim " + (indirim = 0.20));
            else if (adet >= 10) System.out.println("İndirim " + (indirim = 0.10));

            double indirimliTutar = toplamTutar - (toplamTutar * indirim);

            if (indirim > 0) System.out.println("Indirimli tutar: " + indirimliTutar + " Tl");
            else System.out.println("Indirim uygulanmadi. Odemeniz gereken tutar: " + toplamTutar + " Tl");
            }
    }

}


