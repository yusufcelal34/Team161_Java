package day10_nestedIfElse_ternary;

public class C07_TerneryDikkatEdilecekler {
    public static void main(String[] args)
    {

        int sayi = 17;

        // 1.  metod

        // sayi > 20 ? sayi+10 : sayi-10; tek başına yazdıramayız 3 özellik olmadan olmaz

        System.out.println( sayi > 20 ? sayi+10 : sayi-10 );

        sayi = sayi > 20 ? sayi+10 : sayi-10;

        int b = sayi > 20 ? sayi+10 : sayi-10;

        // 2.

        sayi  = 26;
        System.out.println( sayi % 2 == 0 ? "Sayi çift" : sayi+10 );

            // int sonuc = sayi % 2 == 0 ? "Sayi çift" : sayi+10

            // String sonuc = sayi % 2 == 0 ? "Sayi çift" : sayi+10




    }

}
