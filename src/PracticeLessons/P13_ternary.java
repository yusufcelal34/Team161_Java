package PracticeLessons;

import java.util.Scanner;

public class P13_ternary {

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
        System.out.println("Müşteri VIP müşteri mi? (E/H)");
        char vip = scanner.next().toUpperCase().charAt(0);

        int kargoUcreti = 0;
        kargoUcreti = (tutar >= 500) ? 0 : (vip == 'E' ? 10 : 30);

        System.out.println("Kargo ücreti : " + kargoUcreti);
        System.out.println(kargoUcreti==0?"VIP müşteri kampanyasından yararlandınız \nödenecek tutar :"+ (tutar+kargoUcreti):"Ödenecek tutar :"+(tutar+kargoUcreti ));

    }

}

