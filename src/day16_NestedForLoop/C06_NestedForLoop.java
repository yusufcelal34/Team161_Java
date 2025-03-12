package day16_NestedForLoop;

import java.util.Scanner;

public class C06_NestedForLoop {
    public static void main(String[] args) {

        /*
            kullanicidan satir ve sutun sayisini alip asagidaki sekli yazdirin
            orn satir = 4 , sutun= 5 oldugunda
             1 2 3 4 5
             3 4 5 6 7
             4 5 6 7 8
             5 6 7 8 9
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen şekildeki satır sayısını giriniz...: ");
        int satirSayisi = scanner.nextInt();

        System.out.print("Lütfen şekildeki sütun sayısını giriniz...: ");
        int sutunSayisi = scanner.nextInt();

        for (int i = 1; i <= satirSayisi; i++) {
            for (int j = 1; j <= sutunSayisi; j++) {
//                System.out.print((i * j) + "\t"); // Tab kullanarak düzenli çıktı alınır
                System.out.print( "*" + " "); // Tab kullanarak düzenli çıktı alınır

            }
            System.out.println(); // Her satırın sonunda alt satıra geç
        }

        scanner.close(); // Scanner nesnesini kapat


        /*
        kullanicidan satir ve sutun sayisini alip asagidaki sekli cizdirin
        orn satir = 3 , sutun= 6 oldugunda
                * * * * * *
                * * * * * *
                * * * * * *
         */


        }

    }

