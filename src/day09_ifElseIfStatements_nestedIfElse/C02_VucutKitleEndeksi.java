package day09_ifElseIfStatements_nestedIfElse;

import java.util.Scanner;

public class C02_VucutKitleEndeksi
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen kg olarak kilonuzu giriniz");

        Double kilo = scanner.nextDouble();

        System.out.println("lutfen cm olarak boyunuz giriniz");
        Double boy = scanner.nextDouble();

        double vke = kilo * 10000 / (boy * boy);

        System.out.println("Vucut kitle endeksi = " + vke);

        if(vke > 30) System.out.println("Obez");
        else if (vke > 25 ) System.out.println("Kilolu");
        else if (vke > 20 ) System.out.println("Normal");
        else System.out.println("Zayif");




    }

}
