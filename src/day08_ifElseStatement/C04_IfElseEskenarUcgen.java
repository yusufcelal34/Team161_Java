package day08_ifElseStatement;

import javax.swing.*;
import java.util.Scanner;

public class C04_IfElseEskenarUcgen {
    public static void main(String[] args) {

        // Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        // “Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ucgenin kenar uzunluklarini giriniz: ");

        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        if (kenar1 == kenar2 && kenar1 == kenar3 && kenar3 >0)
        {
            System.out.println("Eskenar ucgen");

        }
        else
        {
            System.out.println("Eskenar ucgen degil");
        }

    }
}
