package day21_whileloop_doWhileLoop;

import java.util.Scanner;

public class C02_SayilariToplami {

    public static void main(String[] args) {

        // Soru 4- Kullanicidan toplanmak uzere pozitif tamsayilar isteyin
        //         Kullaniciya bitirmek istediginde 0'a basmasini soyleyin
        //         Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdigini
        //         ve bunlarin toplaminin kac oldugunu yazdirin
        //         Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin
        //         bu negatif sayiyi, sayi adedine ve toplama eklemeyin

        Scanner scanner=new Scanner(System.in);
        int sayi =1;
        int sayilarinToplami=0;
        int sayac = 0;

        while(sayilarinToplami<500 && sayi !=0){

            System.out.print("Toplamak üzere pozitif tam sayı giriniz,\nbitirmek için 0'a basınız ");
            sayi = scanner.nextInt();

            if (sayi>0){
                sayilarinToplami+=sayi;
                sayac++;

            }else if(sayi<0){

                System.out.println("Negatif bir sayı giremessiniz");
            }

        }
        System.out.println("Girilen" +sayac+ "adet pozitif sayının toplamı :"+ sayilarinToplami);
    }
}
