package day03_kullanicidanBilgiAlma_scanner;

import java.util.Scanner;

public class C06_Swap_YerDegistirme    {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Lutfen ilk tam sayiyi giriniz...");
        int sayi1 = Scanner.nextInt();

        System.out.println("Lutfen ikinci tam sayiyi giriniz...");
        int sayi2 = Scanner.nextInt();

        int temp = 0;

        temp = sayi2;
        sayi2 = sayi1;
        sayi1 = temp;
        temp = sayi2;


        System.out.println("Sayilarin yerini degistirin \nsayi1 :" + sayi1 + ", sayi2 :" + sayi2);
    }
}
