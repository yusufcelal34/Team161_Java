package PracticeLessons;

import java.util.Scanner;

public class P12_NestedIfElseStatements {

    public static void main(String[] args) {
    /*
        Bir e-ticaret sitesinde sipariş veren müşterinin kargo ücretini hesaplayan bir Java programı yazınız.
        Eğer sipariş tutarı 500 TL veya daha fazla ise kargo ücretsizdir.
        Eğer sipariş tutarı 500 TL'nin altında ise:
        VIP müşteri olup olmadığı kontrol edilir.
        VIP müşteri ise kargo ücreti 10 TL.
        VIP müşteri değilse kargo ücreti 30 TL.
    */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sipariş tutarı : ");
        double tutar = scanner.nextDouble();
        if (tutar < 500) {
            System.out.println("Nüşteri VİP müşteri mi? (E/H) : ");
            char vip = scanner.next().toUpperCase().charAt(0);
            if (vip == 'E') {
                System.out.println("Kargo ücreti : 10t");
                System.out.println("Ödenecek tutar : " + (tutar + 10));
            }
            else {
                System.out.println("Kargo ücreti : 30t");
                System.out.println("Ödenecek tutar : " + (tutar + 30));
            }
        }else {
            System.out.println("VIP müşterilerimize özel \"Kargo ücretsiz\" seçeneğinden yararlandınız");
            System.out.println("KArgo ücreti : 0t");
            System.out.println("Ödenecek tutar : " + tutar);
        }
        System.out.println("Wise Quarter'dan \"Java\" öğreniyorum");
    }

}

