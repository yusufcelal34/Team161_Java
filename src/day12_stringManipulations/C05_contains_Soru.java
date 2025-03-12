package day12_stringManipulations;

import java.util.Scanner;

public class C05_contains_Soru {
    public static void main(String[] args) {
        // kullanicidan bir metin isteyin
        // metin ev iceriyorsa "Ev gibisi var mi?",
        // metin is iceriyorsa "Calismak ne guzel",
        // metin hem ev hem is iceriyorsa "Evden calismak gibisi yok"
        // metin bu iki kelimeyi de icermiyorsa "Cok calismak lazim, coook" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir metin giriniz: ");

        String mtn = scanner.nextLine().toLowerCase();

        boolean evden = mtn.contains("ev");
        boolean is = mtn.contains("is");

        if (evden && is) {
            System.out.println("Evden çalışmak gibisi yok");
        }
        else if (evden) {
            System.out.println("Ev gibisi var mi?");
        } else if (is) {
            System.out.println("Calismak ne guzel");
        } else {
            System.out.println("Cok calismak lazim, coook");
        }

        scanner.close();


    }
}
