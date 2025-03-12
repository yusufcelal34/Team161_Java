package day08_ifElseStatement;

import java.util.Scanner;

public class C07_IfElse_BuyukHarfKontrolu
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Bir Karakter Giriniz");

        char karakter = scanner.nextLine().charAt(0);

        if (karakter >= 'A' && karakter <= 'Z')
        {
            System.out.println("Buyuk Harf");
        }
        else System.out.println("Buyuk Harf Değil");

// 2. yöntem


    }
}
