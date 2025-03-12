package day19_methodOlusturma;

import java.util.Scanner;

public class C03_FaktoryelGegerineGoreSonucYazdirma {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 17'den küçük, pozitif bir tamsayi giriniz...");
        int girilenSayi = scanner.nextInt();

        int faktoryel = C02_FaktoryelDegerDondurme.faktoryelDegeri(girilenSayi);

        if (faktoryel < 1000000) System.out.println("İyi sayi yazmissin...");
        else System.out.println("BU sayiyi nereden buldun");
    }
}
