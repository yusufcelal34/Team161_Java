package day11_swictchStatements_StringManupulations;

import java.util.Scanner;

public class C08_SM_Length {
    public static void main(String[] args) {
        String str = "Ali Cemil Yataruyumazoğlugillerden";

        System.out.println(str.length()); // bize str'deki karakter sayısını verir

        // son karakteri yazdırın

        System.out.println(str.charAt(str.length() -1));


        Scanner sc = new Scanner(System.in);
        System.out.println("Adınızı giriniz");
        String str1 = sc.nextLine();
        System.out.println("Girdiğim değer " + str1);
        System.out.print(str1.charAt(0) + " " + str1.charAt(str1.length()-1));


    }
}
