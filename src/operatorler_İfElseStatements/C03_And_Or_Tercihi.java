package operatorler_İfElseStatements;

public class C03_And_Or_Tercihi {
    public static void main(String[] args) {

        int sayi = 999;

        System.out.println(sayi >= 10 && sayi <= 99);

        System.out.println(sayi > 97 && sayi < 212);

        char karakter = 'K';
        System.out.println(karakter >= 'a' && karakter <= 'z');
        System.out.println(Character.isLowerCase(karakter) );

        sayi = 154 ;

        // verilen sayi iki basamakli pozitif degilse true yoksa false yazdirin

        System.out.println(sayi< 10 || sayi > 99 );

            karakter = 0;
            System.out.println(karakter < 'A' || karakter > 'z');
            System.out.println(!Character.isUpperCase(karakter) );
            System.out.println( !(karakter >= 'A' && karakter <= 'Z' ));

    }
}
