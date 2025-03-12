package day05_wrapperClass_MatematikselIslemler_Concatenation;

import java.util.Scanner;

public class C04_RakamlarToplaminiBulma
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli pozitif bir tam sayi giriniz");

        int sayi = scanner.nextInt();

        int rakam = 0;
        int rakamlarToplami = 0;

        rakam = sayi % 10;
        rakamlarToplami = rakamlarToplami + rakam;

        sayi = sayi / 10;

        rakam = sayi % 10;
        rakamlarToplami = rakamlarToplami + rakam;

        sayi = sayi / 10;
        rakamlarToplami = rakamlarToplami + sayi;

        System.out.println(rakamlarToplami);
    }
}
