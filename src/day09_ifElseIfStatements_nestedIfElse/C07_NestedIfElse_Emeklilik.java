package day09_ifElseIfStatements_nestedIfElse;

import java.util.Scanner;

public class C07_NestedIfElse_Emeklilik {
    public static void main(String[] args) {
        /* Kullanicidan cinsiyetini ve yasini alin,
        Kadin, 60 yas ve uzeri ,
        Erkek 65 yas ve uzeri emekli olabilir.
        Cinsiyet ve yasini dikkate alarak
        “Emekli olabilirsin” veya “Emekli olmak icin ..
        Yil daha calisman gerekir” yazdirin */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz");
        double yas = scanner.nextDouble();

        System.out.println("Cinsiyetinizi giriniz... K : Kadın , E : Erkek");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        if (cinsiyet == 'K'){
            if (yas<15 || yas>80) System.out.println("Girdiğiniz yaş değeri uygun değil");
            else if (yas >=60) System.out.println("Kadin ve yas 60'dan fazla, emekli olabilir");
            else System.out.println("Kadınlar 60 yaşında emekli olur " + (60-yas) + " yıl daha çalışman lazım");

        }

        else if (cinsiyet == 'E'){
            if (yas<15 || yas>80) System.out.println("Girdiğiniz yaş değeri uygun değil");
            else if (yas >=65) System.out.println("Erkek ve yas 65'dan fazla, emekli olabilir");
            else System.out.println("Erkekler 65 yaşında emekli olur " + (65-yas) + " yıl daha çalışman lazım");
        }
        else System.out.println("Cinsiyet olarak girilen deger hatali");



    }
}
