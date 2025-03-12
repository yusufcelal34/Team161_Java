package day16_NestedForLoop;

import java.util.Scanner;

public class C05_NestedLoop {
    public static void main(String[] args) {

        /*
            kullanicidan satir ve sutun sayisini alip asagidaki sekli yazdirin
            orn satir = 4 , sutun= 5 oldugunda
             2 3 4 5 6
             3 4 5 6 7
             4 5 6 7 8
             5 6 7 8 9
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen şekildeki satır sayısını giriniz...: ");
        int satirSayisi = scanner.nextInt();

        System.out.println("Lütfen şekildeki sütün sayısını giriniz...: ");
        int sutunSayisi = scanner.nextInt();

        for (int i = 1; i <=satirSayisi; i++) {
            for (int j = 1; j <=sutunSayisi ; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println("");
        }


    }
}
