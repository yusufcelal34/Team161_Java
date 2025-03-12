package A01_Odev;

import java.util.Scanner;

public class odev_4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Bir tam sayi girin");

        int a = scan.nextInt();



        if(a%2==0) {

            if(a%3==0) {

                System.out.println("A");

            }else {

                System.out.println("B");

            }

        }else{

            if(a%3==0) {

                System.out.println("C");

            }else {

                System.out.println("D");

            }

        }
    }

}
