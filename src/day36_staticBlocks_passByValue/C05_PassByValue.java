package day36_staticBlocks_passByValue;

public class C05_PassByValue {

    public static void main(String[] args) {


        int sayi = 4;

        System.out.println(sayiyiDegistir(sayi));

        System.out.println(sayi);

        sayi= sayiyiDegistir(sayi);

        System.out.println("Main method'da çağrılan sayı : "+sayi);
    }

    public static int sayiyiDegistir(int sayi) {

        // sayi cift ise sayinin degerini 2 katina cikarin
        // sayi tek ise sayinin degerini 5 artirin
        // ve sayinin son halini dondurun

        if (sayi % 2 == 0) {
            sayi = sayi * 2;
        } else {
            sayi = sayi + 5;
        }

        return sayi;
    }
}
