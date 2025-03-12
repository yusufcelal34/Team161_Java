package day05_wrapperClass_MatematikselIslemler_Concatenation;

import java.util.Scanner;

public class C03_Modules {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi giriniz: ");

        int girilenSayi = scanner.nextInt();

        System.out.println( girilenSayi % 2 );

        System.out.println( girilenSayi % 5 );

        System.out.println( girilenSayi % 10 );




    }
}
