package day10_nestedIfElse_ternary;

import java.util.Scanner;

public class C02_HarfKontrolu
{
    public static void main(String[] args) {

        /* Kullanicidan bir karakter girmesini isteyin
           Kullanici kucuk harf girerse
                - a ise "guzel harf"
                - b,c veya d ise "idare eder"
                - diger kucuk harfler icin "girilen kucuk harfi begenmedim" yazdirin Kullanici buyuk harf girerse
                - K ise "guzel harf"
                - L, V veya Z ise "idare eder"
                - diger buyuk harfler icin "girilen buyuk harfi begenmedim" yazdirin Kullanici ingilizce harfler disinda bir karakter girerse

             8:50
            - "Tanimlanmamis karakter" yazdirin
         */
    // Ana değişken girilen harfin küçük veya büyük harf olmasını seçtik

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz...");

        char karakter = scanner.next().charAt(0);

        if (karakter >= 'a' && karakter <= 'z')
        {
            if (karakter == 'a') System.out.println("Guzel harf");
            else if (karakter == 'b' || karakter =='c' || karakter == 'd')
                System.out.println("İdare eder");
            else System.out.println("Girilen kucuk harfi begenmedim...");
        }
        if (karakter >= 'A' && karakter <= 'Z')
        {
            if (karakter == 'K') System.out.println("Guzel harf");
            else if (karakter == 'L' || karakter =='V' || karakter == 'Z')
                System.out.println("İdare eder");
            else System.out.println("Girilen buyuk harfi begenmedim...");
        }
        else
        {
            System.out.println("Tanımlanmamış karakter");
        }



    }
}
