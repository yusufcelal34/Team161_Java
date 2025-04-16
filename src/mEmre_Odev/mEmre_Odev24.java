package mEmre_Odev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mEmre_Odev24 {
    public static void main(String[] args) {
        /*24----
    Yazılan değerin array içerisinde arayan Java Kodu yazınız.
    Array: [1551,1223,1443,1267,1789,1023,2020]

    Aranan Değer:2020
    Beklenen Çıktı:True

    Aranan Değer:2010
    Beklenen Çıktı :False
    */

//        List a = new ArrayList();
//
//        a.add(1551);
//        a.add(1223);
//        a.add(1443);
//        a.add(1267);
//        a.add(1789);
//        a.add(1023);
//        a.add(2020);
//
//        System.out.println(a);
//
//        System.out.println("Aranan Deger :"+ a.contains(1551));
//        System.out.println("Aranan Deger :"+ a.contains(2010));

        int[] array = {1551, 1223, 1443, 1267, 1789, 1023, 2020};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir değer giriniz : ");
        int narananDeger = scanner.nextInt();

        boolean bulundu = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == narananDeger) {
                bulundu = true;

            }

        }
        System.out.println("Beklene çıktı : " + bulundu);
    }
}
