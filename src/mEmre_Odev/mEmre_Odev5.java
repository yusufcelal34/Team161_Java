package mEmre_Odev;

import java.util.Scanner;

public class mEmre_Odev5 {
    public static void main(String[] args) {
/*5-----
    Aşağıdaki elmas deseni görüntüsünü çizen java kodunu yazınız.
    Test Data:
    Yarım elmas uzunluğu : 7
    Beklenen Çıktı:
          *
         ***
        *****
       *******
      *********
     ***********
    *************
     ***********
      *********
       *******
        *****
         ***
          *
    */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        int sayi = scanner.nextInt();

        System.out.println("1 den 10 kadar bir sayı giriniz");

        for (int i = 1; i <= sayi; i++) {
            for (int j = i; j < sayi; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = sayi - 1; i >= 1; i--) {
            for (int j = sayi; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
