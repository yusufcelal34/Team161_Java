package day21_whileloop_doWhileLoop;

public class C01_RakamlarToplaminiBulma {

    public static void main(String[] args) {

        // verilen pozitif bir tamsayinin rakamlar toplamini
        // while loop ile bulup
        // bize donduren bir method olusturun

        System.out.println(getRakamlarToplami(1234));
        System.out.println(getRakamlarToplami(12));


    }
    public static int getRakamlarToplami(int sayi) {
        int rakam =0;
        int rakamlarToplami = 0;

        while (sayi>0){

            rakam = rakam % 10;

            rakamlarToplami += rakam;

            sayi/=10;

        }

        return rakamlarToplami;
    }
}
