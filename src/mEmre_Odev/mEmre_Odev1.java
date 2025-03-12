package mEmre_Odev;

import java.util.Scanner;

public class mEmre_Odev1 {
    public static void main(String[] args) {

//        Sayinin Sayi degerlerinin toplamasini yapan Java kodu yaziniz.
//
//        Test Data
//        34
//        Beklenen Cikti
//        7


        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();
        scanner.close();

        int topla = 0;
        int deger = number;

        while (deger != 0) {
            topla += deger % 10;
            deger /= 10;
        }

        System.out.println("Basamak değerleri toplamı: " + topla);
    }
}
