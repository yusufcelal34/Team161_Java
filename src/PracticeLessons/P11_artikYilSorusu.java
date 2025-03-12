package PracticeLessons;

import java.util.Scanner;

public class P11_artikYilSorusu {

    public static void main(String[] args) {

    /*
         Girilen yılın artık yıl olup olmadığını bulunuz
         Şartlar:
         Artık yıl
         4'e bölünen ama 100'e bölünmeyen yıllardır
         100'e bölünen yıllardan aynı zamanda 400' de bölünebilen yıllardır
     */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kontrol etmek istediğiniz yılı giriniz: ");
        int year = scanner.nextInt();

        if (year % 100 ==0 && year % 4 == 0) {
            System.out.println(year + " yılı bir artık yıldır. ");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " yılı bir artık yıldır. ");
        }else {
            System.out.println(" yılı bir artık yıl değildir. ");
        }
    }

}

