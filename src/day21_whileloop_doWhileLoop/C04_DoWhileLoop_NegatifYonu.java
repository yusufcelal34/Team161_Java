package day21_whileloop_doWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop_NegatifYonu {

    public static void main(String[] args) {

  /*    Do while Loop'un avantajı :
        Loop body'sinin en az bir kere çalışmasıdır.

        Do while Loop'un dezavantajı :
        Loop body'sinin en az bir kere çalışmasıdır.

        Örneğin aşağıdaki görevde kullaıcının 0 girdiğinde Loop body'nin çalışmaması gerekirken
        while kontrolünden önce çalıştığı için yapmaması gerektiği halde 0 yazdırdı.
*/

        // Kullanıcıdan alınan pozitif tamsayidan baslayarak
        // 1'e kadar olan sayilari aralarinda 1 bosluk olacak sekilde
        // yan yana yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayi giriniz: ");
        int sayi = scanner.nextInt();

        do{
            System.out.println(sayi + " ");
            sayi--;
        }while (sayi >= 1);

    }
}
