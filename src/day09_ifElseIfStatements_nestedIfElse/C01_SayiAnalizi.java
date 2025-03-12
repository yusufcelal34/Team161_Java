package day09_ifElseIfStatements_nestedIfElse;

import java.util.Scanner;

public class C01_SayiAnalizi
{
    public static void main(String[] args) {

        // kullanicidan pozitif bir tamsayi isteyin
        // kullanici
        // negatif sayi girerse uyarin
        // tek basamakli bir sayi girerse "girdiginiz sayi rakam"
        // kullanici 10-99 arasinda (sinirlar dahil) sayi girerse "iki basamakli sayi"
        // kullanici 100-999 arasinda (sinirlar dahil) sayi girerse "uc basamakli sayi"
        // kullanici 1000 veya daha buyuk sayi girerse "cok buyuk sayi" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi = scanner.nextInt();

        if (sayi < 0) {
            System.out.println("Negatif sayi giremessiniz");
        }
        else if (sayi >= 0 && sayi <= 9) {
            System.out.println("Girdiginiz sayi " + sayi + " rakami giriniz");
        }
        else if (sayi >= 10 && sayi <= 99) {
            System.out.println("Iki basamakli sayi");
        }
        else if (sayi >= 100 && sayi <= 999) {
            System.out.println("Uc basamakli sayi");
        }
        else {
            System.out.println("Cok buyuk sayi");
        }

    }
}
