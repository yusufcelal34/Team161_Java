package A01_Odev;

import java.util.Scanner;

public class odev_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Bir harf giriniz");

        char harf = scan.next().charAt(0);



        if (harf >= 'a' && harf <= 'z') {

            System.out.println("Kucuk harf");

        } else if (harf >= 'A' && harf <= 'Z') {

            System.out.println("Buyuk harf");

        } else {

            System.out.println("Giris hatali,lutfen harf giriniz!");

        }

        scan.close();

    }

}
