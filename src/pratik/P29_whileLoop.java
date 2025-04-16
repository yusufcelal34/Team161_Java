package pratik;

import java.util.Scanner;

public class P29_whileLoop {
    public static void main(String[] args) {

        // Girilen pozitif bir sayının tam kare olup olmadığını bulunuz,
        // tamkare ise true  değilse false yazdırınız.
        // Not: sqrt gibi fonksiyonları  kullanmayın.

        // Example 1:
        // Input: 16
        // Output: true
        // Not: bu sayı tamkare çünkü 4*4 = 16

        Scanner scan = new Scanner(System.in);
        System.out.print("Pozitif tam bir sayi giriniz : ");
        int sayi = scan.nextInt();

        boolean tamKareBulma = false;
        int i=1;
        while (i*i <= sayi) {
            if (i*i == sayi) {
                tamKareBulma = true;
                break;
            }
            i++;
        }
        if (tamKareBulma) {
            System.out.println("Girdiğiniz "+sayi +" sayısı " +i +" sayısının tam karesidir");
        }


//        if (sayi > 0) {
//            for (int i = 1; i * i <= sayi; i++) {
//                if (i * i == sayi) {
//                    tamKareBulma = true;
//
//                }
//
//            }
//            System.out.println(tamKareBulma);
//        }
    }
}

