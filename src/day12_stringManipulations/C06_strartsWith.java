package day12_stringManipulations;

import java.util.Scanner;

public class C06_strartsWith {
    public static void main(String[] args) {

        String str = "Kod yazmak cok guzel";

        System.out.println(str.startsWith("K"));

        System.out.println(str.startsWith("k"));

        System.out.println(str.startsWith("Kod y"));

        System.out.println(str.startsWith("Kod  y"));

        System.out.println(str.startsWith(""));

        System.out.println(str.startsWith("Kod yazmak cok guzel"));

        System.out.println(str.startsWith("yazmak" , 4));


        System.out.println(str.startsWith("cok" , 10));

        System.out.println(str.startsWith("cok" , 11));


        System.out.println(str.startsWith("" , 10));


    }
}
