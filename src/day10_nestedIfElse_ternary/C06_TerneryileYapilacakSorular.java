package day10_nestedIfElse_ternary;

public class C06_TerneryileYapilacakSorular {
    public static void main(String[] args) {

        // Verilen bir notu kontrol edip
        // 50 veya daha buyukse "Sinifi Gectin",
        // 50’den kucukse "Maalesef kaldin" yazdirin.

        int not = 50;
        System.out.println( not >= 50 ? "Sinifi gectin" : "Malesef kaldin");

    int sayi1 = 76;
    int sayi2 = 76;

        System.out.println( sayi1 > sayi2  ? sayi2 : sayi1);



        int sayi = 765;
        System.out.println( sayi  % 3 == 0  ? "Üç'ün katı" : "Üç'ün katı değil");
    }

}
