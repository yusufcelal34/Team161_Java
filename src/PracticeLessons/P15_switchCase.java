package PracticeLessons;

import java.util.Scanner;

public class P15_switchCase {

    public static void main(String[] args) {

        /*
        Bir bankamatik menüsü ve seçime göre işlem yapan bir JAVA Programı Yazınız

        ========= WISE BANK ATM =========
            1- Hesap Bakiyesi Göster
            2- Para Çek
            3- Para Yatır
            4- Çıkış

 */

        Scanner scanner = new Scanner(System.in);
        System.out.println("=========== WISE BANK ATM ===========\n=============== MENU ================");
        System.out.println("\t1-Hesap bakiyesi göster\n\t2-Para çek\n\t3-Para yatır\n\t4-Çıkış ");
        System.out.println("Hoşgeldiniz\nLütfen yapmak istediğiniz işlemi seçiniz\nSeçim");
        int bakiye = scanner.nextInt();
        int secim = 103256;

        switch (secim) {
            case 1:
                System.out.println("\nBankamızda kayıtlı hesaplarınızın bakiyesi :" + bakiye);
                break;
            case 2:
                System.out.println("\nSeçmek istediğiniz tutarı giriniz: ");
                int cekilen = scanner.nextInt();
                if (cekilen > bakiye) {
                    System.out.println("Hesap tutarınız istediğiniz bakiye için yetersizdir ");
                } else {
                    System.out.println("Çekilen tutar: " + cekilen);
                    System.out.println("Kalan hesap bakiyeniz : " + (bakiye - cekilen));
                }
                break;
            case 3:
                System.out.println("Yatırmak istediğiniz tutarı giriniz :");
                int yatan = scanner.nextInt();
                System.out.println("Yatırılan tutar: " + yatan);
                System.out.println("Güncel hesap bakiyeniz" + (bakiye + yatan));
                break;

            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Yanlış Giriş yaptınız. Kartınız iade ediliyor\nLütfen yeniden deneyiniz.");


        }


    }

}

