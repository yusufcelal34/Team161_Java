package PracticeLessons;

import java.util.Scanner;

public class P10_IfElseStatements {

    public static void main(String[] args) {
        /* Problem tanimi : Kulanicidan aracacinin hizini aliniz Trafik cezasinin
         * degerini hesaplayin. 45 hiz siniridir.
         * Eger Hiziniz 55-74 arasinda ise: Ceza 100 $'dir.
         * Eger Hiziniz 75 - 84 arasinda ise: Ceza 150 $'dir.
         * Eger Hiziniz 85 -94 arainda ise: Ceza 320 $'dir.
         * Eger Hiziniz 94'den daha fazla ise: Ceza 500 $'dir.
         * Eger kullanicinin ehliyeti yoksa cezaya 200 $ eklenir.
         * orn: Hiziniz 77 iken cezaniz 150$'dir ama ehliyetiniz yoksa ceza 350 $ olur.
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Aracın hızı: ");
        double hiz = scan.nextDouble(); // Double yerine double kullanıldı

        int ceza = 0;
        if (hiz >= 55 && hiz <= 74) {
            ceza = 100;
        } else if (hiz >= 75 && hiz <= 84) {
            ceza = 150;
        } else if (hiz >= 85 && hiz <= 94) {
            ceza = 320;
        } else if (hiz > 94) {
            ceza = 500;
        }

        System.out.println("Ehliyetiniz var mı? (E / H)");
        char ehliyet = Character.toUpperCase(scan.next().charAt(0)); // Küçük harf desteği eklendi

        if (ehliyet == 'E') {
            System.out.println("Ceza tutarı: " + ceza + " $");
        } else if (ehliyet == 'H') {
            ceza += 200;
            System.out.println("Ceza tutarı: " + ceza + " $");
        } else {
            System.out.println("Yanlış giriş yapıldı! Lütfen sadece 'E' veya 'H' giriniz.");
        }

        scan.close();
    }

}

