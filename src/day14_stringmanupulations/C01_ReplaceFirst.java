package day14_stringmanupulations;

import java.util.Scanner;

public class C01_ReplaceFirst {
    public static void main(String[] args) {

        String str = "Hello World";
        System.out.println(str.replaceFirst("e" , "E"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfden bir metin giriniz : ");
        String metin = scanner.nextLine();

        System.out.println(metin.replaceFirst("\\d" , "*"));

        System.out.println(metin.replaceFirst(" " , "X"));
        System.out.println(metin.replaceFirst("\\s" , "X"));
    }
}