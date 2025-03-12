package day08_ifElseStatement;

import java.util.Scanner;

public class C08_IfElse_BuyukHarfecevir
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Bir Karakter Giriniz");

        char karakter = scanner.nextLine().charAt(0);

        if (karakter >= 'a' && karakter <= 'z')
        {
            System.out.println( (char) (karakter - 32));
        }
        else

            System.out.println(karakter);

// 2. yöntem

        if ( Character.isLowerCase(karakter)   ){
            // karakter kucuk harf ise
            System.out.println(  Character.toUpperCase(karakter)   );

        } else {
            // karakter kucuk harf degil ise
            System.out.println(karakter);


        }
    }
}
