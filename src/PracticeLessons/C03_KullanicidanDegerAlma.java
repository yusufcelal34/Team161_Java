package PracticeLessons;

import java.util.Scanner;

public class C03_KullanicidanDegerAlma
{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Adınızı Giriniz: ");
        String name = scan.nextLine();

        System.out.print("Soyadınızı Giriniz: ");
        String surname = scan.nextLine();

        System.out.print("Yaşınızı Giriniz: ");
        int age = scan.nextInt();

        System.out.println("__________Kullanıcı Bilgileri__________");

        System.out.println("Adı    : " + name );
        System.out.println("Soyadı : " + surname );
        System.out.println("Yaşı   : " + age);

    }
}
