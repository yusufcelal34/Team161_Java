package day09_ifElseIfStatements_nestedIfElse;

import java.util.Scanner;

public class C05_CokluDegisken
{
    public static void main(String[] args) {

        /* Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri ,
        Erkek 65 yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak
        “Emekli olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz");
        double yas = scanner.nextDouble();

        System.out.println("Cinsiyetinizi giriniz... K : Kadın , E : Erkek");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        if (yas < 15 || yas > 80 || !(cinsiyet == 'E' || cinsiyet == 'K') )

        System.out.println("Girdiğiniz değerler uygun değil");

        else if (cinsiyet == 'K' && yas>=60) System.out.println("Emekli olabilir");
        else if ((cinsiyet == 'K')  &&  yas<60) System.out.println("Emekli olman için " + (60-yas) + " yıl daha calısman lazım");
        else if (cinsiyet == 'E' && yas>=65) System.out.println("Emekli olabilir");
        else if (cinsiyet == 'E' && yas<65) System.out.println("Emekli olman için " + (65-yas) + " yıl daha calısman lazım");
    }
}
