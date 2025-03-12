package day21_whileloop_doWhileLoop;

import java.util.Scanner;

public class C06_KareOlupOlmadiginiBulma {

    public static void main(String[] args) {

        // Soru 3- Kullanicidan bir pozitif sayi isteyin,
        //         sayının tam kare olup olmadığını bulunuz,
        //         tamkare ise true değilse false yazdırınız.
        //	Ornek :  input : 16 (4*4) , output: true

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayi giriniz: ");
        int sayi = scanner.nextInt();
        int karakok = 1;
        // boolean tamKareMi = false;

        while (karakok * karakok <= sayi) {

            if (karakok * karakok == sayi) {
                System.out.println("TRUE");
                System.out.println(sayi + " ====>>>> Sayısının karakök ====>>>> " + (karakok + " * " + karakok) + " Loop bitti");
                break;

            }
            karakok++;

            if (karakok * karakok > sayi) {
                System.out.println(sayi + " sayısı tam kare değildir. En yakın karekök yaklaşık: " + (karakok - 1) + "\nFALSE");

                break;
            }
        }

        // ODEV : false yazmasi için kod eklenecek
    }
}
