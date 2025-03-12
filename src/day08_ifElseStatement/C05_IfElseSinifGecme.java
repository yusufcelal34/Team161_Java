package day08_ifElseStatement;

import java.util.Scanner;

public class C05_IfElseSinifGecme {
    public static void main(String[] args) {

        // Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
        // kucukse “Maalesef kaldin” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen notu giriniz: ");

        double not = scanner.nextDouble();

        if (not >= 50) {
            System.out.println("Sınıfı Geçtin");
        }
        else {
            System.out.println("Malesef Kaldın");
        }
    }
}
