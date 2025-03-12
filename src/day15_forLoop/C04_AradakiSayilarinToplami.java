package day15_forLoop;

import java.util.Scanner;

public class C04_AradakiSayilarinToplami {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        //        sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        //        Bitis degeri baslangic degerinden kucukse,
        //        uyari yazdirip islemi sonlandirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen baslangic degerini giriniz: : ");
        int baslangic = scanner.nextInt();
        System.out.println("Lutfen bitis degerini giriniz: : ");
        int bitis = scanner.nextInt();

        int toplam = 0;
        if (baslangic < bitis) {
            for (int i = baslangic; i <= bitis; i++) {
                toplam += i;
            }
            System.out.print("Girilen sayilarin toplam degeri...: " + toplam);
        } else
            for (int i = baslangic; i < bitis; i--) {
                toplam += i;


            } System.out.println("Baslangic bitisden buyuktur");
        System.out.print("Girilen sayilarin toplam degeri...: " + toplam);
    }
}