package pratik;

import java.util.Scanner;

public class P28_whileLoop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("5 adet sayi giriniz! : ");

        int sayi = 0;
        int enBuyuk =0;
        int sayac=1;

        while (sayac <=5) {
            System.out.print(sayac + ". sayıyı giriniz : ");
            sayi = scan.nextInt();
            if (sayi > enBuyuk) {
                enBuyuk = sayi;
            }
            sayac++;
        }
        System.out.println("Girilen sayılardan en büyüğü : " + enBuyuk);

    }
}

