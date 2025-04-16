package pratik;

import java.util.Scanner;

public class P27_whileLoop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen 100 den büyük bir tam sayi giriniz : ");
        long sayi = scan.nextLong();


        basamakDegeriTopla(sayi);
    }

    public static void basamakDegeriTopla(long sayi) {

        long toplam = 0;

        long girilenSayi = sayi;
        while (sayi != 0) {
            toplam += sayi % 10;
            sayi = sayi / 10;

        }
        System.out.println("Girmiş olduğunuz " + girilenSayi + " ve toplam durumu " + toplam);


    }
}

