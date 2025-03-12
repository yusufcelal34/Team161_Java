package day08_ifElseStatement;

import java.util.Scanner;

public class C06_IfElseEmeklilik {
    public static void main(String[] args){

        // Kullanicidan yasini isteyin, 65 yas ve uzeri ise ”Emekli olabilirsin” yazdirin,
        // yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen yasi giriniz: ");

        int yas = scanner.nextInt();

        if (yas >= 65) {
            System.out.println("Emekli olabilirsin");
        }
        else {
            int yil = 65 - yas;
            System.out.println("Çalışmanız gereken "+ yil +" yıl daha çalışmalısın");
        }
    }
}
//


