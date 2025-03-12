package PracticeLessons;

import java.util.Scanner;

public class P06_IncrementDecrement
{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Adınız Soyadınız: ");
        String fullname = scan.nextLine();
        System.out.print("Yaşınız: ");
        int age = scan.nextInt();
        int sonNo=202501;

        // Sonuçları ekrana yazdır
        System.out.println("__________Kullanıcı Bilgileri__________");
        System.out.println("Adı Soyadı: " + fullname);
        System.out.println("Yaş       : " + age);
        sonNo++;
        System.out.println( "Yeni öğrenciye verilecek no: "+sonNo);

    }
}

