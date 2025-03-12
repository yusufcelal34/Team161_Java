package day13_stringManipulations;

import java.util.Scanner;

public class C04_LastIndexOf {
    public static void main(String[] args) {

        String str = "Hersey cok guzel olacak cok";
        System.out.println(str.indexOf("e"));
        System.out.println(str.indexOf("e", 2));

        System.out.println(str.lastIndexOf("a"));

        str = "Java ile kod yaz, kod yazmak cok guzel";

        System.out.println(str.indexOf("Java"));
        System.out.println(str.lastIndexOf("Java"));

        System.out.println(str.indexOf("kod"));
        System.out.println(str.lastIndexOf("kod"));


        System.out.println(str.indexOf("a"));
        System.out.println(str.lastIndexOf("a"));

        System.out.println(str.indexOf("yaz"));
        System.out.println(str.lastIndexOf("yaz"));

        System.out.println(str.indexOf("x"));
        System.out.println(str.lastIndexOf("x"));
    }
}




