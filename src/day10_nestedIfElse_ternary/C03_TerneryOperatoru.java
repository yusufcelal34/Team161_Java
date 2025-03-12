package day10_nestedIfElse_ternary;

import java.util.Scanner;

public class C03_TerneryOperatoru {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayi giriniz :");

        int sayi = scanner.nextInt();

        if (sayi% 2 == 0)
        {
            System.out.println("Cift sayi");
        } else {
            System.out.println("Tek sayi");
        }

        // TGernary operatoru if else ile yapılabilen basit işlemleri
        // daha kısa ve daha basit şekilde yazmamıza imkan tanır.

        System.out.println(sayi % 2 == 0 ? "Cift sayi" : "Tek sayi" );

    }
}
