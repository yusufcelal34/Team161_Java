package day10_nestedIfElse_ternary;

import java.util.Scanner;

public class C04_TerneryAtama {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayi giriniz :");

        int sayi = scanner.nextInt();

        if (sayi > 100) {
            System.out.println("10 azalt " + (sayi - 10));
        } else {
            System.out.println("2 katına çıkart " + (sayi * 2));
        }

        // TGernary operatoru if else ile yapılabilen basit işlemleri
        // daha kısa ve daha basit şekilde yazmamıza imkan tanır.

        System.out.println(sayi > 100 ? "10 Azalt " + (sayi - 10) : "2 katına çıkart " + (sayi * 2));

    }
}
