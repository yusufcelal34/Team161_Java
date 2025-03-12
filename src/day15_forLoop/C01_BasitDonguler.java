package day15_forLoop;

import java.util.Scanner;

public class C01_BasitDonguler {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen baslangic degerini giriniz: : ");
        int baslangic = scanner.nextInt();
        System.out.println("Lutfen bitis degerini giriniz: : ");
        int bitis = scanner.nextInt();



        for (int i = baslangic; i <= bitis; i = i +3) {
            System.out.print(i + " ");

            if (i % 10 == 0) {
                System.out.print("\n");
            }
        }


            System.out.println("\n*********************");

            for (int i = 100; i <= 245; i = i + 9) {
                System.out.print(i + " ");


                if (i % 10 == 0) {
                    System.out.print("");
                }
            }

        }
    }
