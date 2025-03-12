package day09_ifElseIfStatements_nestedIfElse;

import java.util.Scanner;

public class C04_ElseileBitmezse {
    public static void main(String[] args)
    {

        // Kullanicidan pozitif bir tamsayi isteyin
        // sayi hem 3 hem 5 ile bolunuyorsa "super",
        // sayi sadece 3 ile bolunuyorsa "3'un kati"
        // sayi sadece 5 ile bolunuyorsa "5'in kati" yazdirin

        Scanner scanner = new Scanner(System.in);
        int sayi = scanner.nextInt();

        if (sayi % 5 == 0 && sayi % 3 == 0) System.out.println("Super");
        else if (sayi % 5 == 0) System.out.println("5'in kati");
        else if (sayi % 3 == 0) System.out.println("3'ün kati");

    }
}
