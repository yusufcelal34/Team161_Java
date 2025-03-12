package day16_NestedForLoop;

import java.util.Scanner;

public class C08_NestedForLoop {
    public static void main(String[] args) {

        /*
            kullanicidan satir ve sutun sayisini alip asagidaki sekli yazdirin
            orn satir = 4 , sutun= 5 oldugunda
             *
             **
             ***
             ****
             *****
         */


        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen şekildeki satır sayısını giriniz...: ");
        int satirSayisi = scanner.nextInt();

        for (int i = 1; i <= satirSayisi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }

        scanner.close();

    }
}


