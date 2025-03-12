package day15_forLoop;

import java.util.Scanner;

public class C06_FaktoryelHesabi {
    public static void main(String[] args) {

        // Kullanicidan 17’den kucuk bir pozitif tamsayi alip,
        // bu sayinin faktoryel degerini hesaplayin.
        //	Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 17'den kucuk bir pozitif tamsayi giriniz: ");
        int sayi = scanner.nextInt();

        if (sayi < 17 && sayi > 0) {
            int faktoriyel = 1;

            for (int i = 1; i <= sayi; i++) {
                faktoriyel *= i;

            }System.out.println(sayi + " sayisinin faktoriyel degeri: " + faktoriyel);

        } else {
            System.out.println("Lütfen 17'den küçük pozitif bir tam sayı giriniz.");
        }
    }
}