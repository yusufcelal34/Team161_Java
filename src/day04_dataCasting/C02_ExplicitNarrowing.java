package day04_dataCasting;

public class C02_ExplicitNarrowing {

    public static void main(String[] args) {

        int a = 13;
        int b = 4567;


        byte c = (byte) a;
        byte d = (byte) b;
        System.out.println("13'un byte variable'a atamış hali : " + c);
        System.out.println("4567'un byte variable'a atamış hali : " + d);


        double dbl1 = 74.3 ;
        float fl1 = 57.98F ;


        int sayi1 = (int) dbl1 ;

        int sayi2 = (int) fl1 ;

        System.out.println(sayi1);
        System.out.println(sayi2);



    }

}
