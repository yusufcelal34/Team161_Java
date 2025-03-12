package day06_Increment_decrement;

public class C02_preincrement_postincrement {
    public static void main(String[] args) {

        // 1.ihtimal ayni satirda yazdirma islemi olursa

        int a = 20;
        int b = 40;


        System.out.println(  a++ ); // 20


        System.out.println("16.satirda a : " + a); // 21


        a= 20;

        System.out.println(  ++a   ); // 21



        System.out.println("24.satirda a : " + a); // 21

        b= 40;

        System.out.println( b-- ); //40

        System.out.println("30.satirda b : " + b); // 39


        b= 40;

        System.out.println(  --b  );// 39

        System.out.println("37.satirda b : " + b); // 39


        // 2.ihtimal ayni satirda atama islemi olursa


        a= 20;

        int c = a++;

        System.out.println("47.satirda a : " + a + ", c : " + c);



        a = 20;


        c = ++a;


        System.out.println("57.satirda a : " + a + ", c : " + c);



        b = 40;

        c = b--;


        System.out.println("66.satirda a : " + b + ", c : " + c);

        b = 40;

        c = --b;

        System.out.println("72.satirda a : " + b + ", c : " + c);



        a = 20;

        c = 2 * a++ -3;


        System.out.println("81.satirda a : " + a + ", c : " + c);


        a = 20;

        c = ++a + 20;
        System.out.println("87.satirda a : " + a + ", c : " + c);

        b = 40;
        c =  3 * (b-- -2);
        System.out.println("91.satirda b : " + b + ", c : " + c);

        b = 40;
        c =  2 * --b +3;
        System.out.println("95.satirda b : " + b + ", c : " + c);


    }
}
