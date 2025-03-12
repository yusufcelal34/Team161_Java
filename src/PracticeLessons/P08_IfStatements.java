package PracticeLessons;

import java.util.Scanner;

public class P08_IfStatements {

    public static void main(String[] args) {

        //Kullanıcından bir sayı alın sayı çift sayı ise çift sayııdır. tek ise tek sayıdır.
        //sıfıt girmişşeniz sıfır girdiniz desin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        int sayi = scan.nextInt();

        if (sayi==0)
        {
            System.out.println("Girilen Sayı sıfırdır");
        }
        if(sayi%2==0)
        {
            System.out.println("Girilen sayı çift sayıdır.");
        }
        if(sayi%2!=0)
            System.out.println("Girilen sayı tek sayıdır: ");


    }
}
