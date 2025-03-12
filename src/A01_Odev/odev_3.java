package A01_Odev;

import java.util.Scanner;

public class odev_3 {
    public static void main(String[] args) {

        // Scanner nesnesi ile kullanıcıdan input alıyoruz
        Scanner scanner = new Scanner(System.in);

        // Cinsiyet bilgisini alıyoruz
        System.out.println("Cinsiyetinizi giriniz (Erkek / Kadin): ");
        String cinsiyet = scanner.nextLine();

        // Yaş bilgisini alıyoruz
        System.out.println("Yaşınızı giriniz: ");
        int yas = scanner.nextInt();

        // Cinsiyet ve yaşa göre çıktıyı kontrol ediyoruz
        if (cinsiyet.equals("Erkek")) {
            if (yas < 18) {
                System.out.println("a");
            } else {
                System.out.println("b");
            }
        } else if (cinsiyet.equals("Kadin")) {
            if (yas < 18) {
                System.out.println("c");
            } else {
                System.out.println("d");
            }
        } else {
            System.out.println("e");
        }

        scanner.close();
    }

}
