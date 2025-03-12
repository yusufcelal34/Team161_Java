package mEmre_Odev;

import java.util.Scanner;

public class mEmre_Odev6 {
    public static void main(String[] args) {
/*6----
    Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
    değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
    1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)

    Sesli harfler: a,e,i,o,u
    Test Data:  a
    Beklenen Çıktı:
    a harfi sesli harfdir.
    Test Data:  d
    Beklenen Çıktı: d harfi sesiz harftir.
    Test Data:    we  yada %
    Beklenen Çıktı:
    Yanlis karakter girdiniz!

    */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir harf giriniz");
        String input = scanner.nextLine();
        scanner.close();

        if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
            System.out.println("Yanlis karakter girdiniz!");
        } else {
            char harf = input.charAt(0);
            harf = Character.toLowerCase(harf);
            if (harf == 'a' || harf == 'e' || harf == 'i' || harf == 'ı'|| harf == 'o' || harf == 'ö' || harf == 'u' || harf == 'ü') {
                System.out.println(harf + " harfi sesli harf");
            } else System.out.println(harf + " harfi sessiz harf");

        }
    }
}
