package day16_NestedForLoop;

import java.util.Scanner;

public class C09_NestedLoop {
    public static void main(String[] args) {

        /*
            kullanicidan satir ve sutun sayisini alip asagidaki sekli yazdirin
            orn satir = 4 , sutun= 5 oldugunda
             0
             0 1
             0 1 2
             0 1 2 3
             0 1 2 3 4
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen şekildeki satır sayısını giriniz...: ");
        int satirSayisi = scanner.nextInt();


        for (int i = 1; i <=satirSayisi; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j -1+" " );
            }
            System.out.println("");
        }


    }
}
