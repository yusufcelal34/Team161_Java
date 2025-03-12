package day13_stringManipulations;

import java.util.Scanner;

public class C06_isEmpty_isBlank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String  str1 ="";
        String  str2 = " ";
        String  str3 = "       ";
        String  str4 = "  Ali   ";

        System.out.println("str 1.isEmpty()====>> "+str1.isEmpty());
        System.out.println("str 2.isEmpty()====>>  "+str2.isEmpty());
        System.out.println("str 3.isEmpty()====>>  "+str3.isEmpty());
        System.out.println("str 4.isEmpty()====>>  "+str4.isEmpty());

        System.out.println("**********************");

        System.out.println("str 1.isBlank()====>>  "+str1.isBlank());
        System.out.println("str 2.isBlank()====>>  "+str2.isBlank());
        System.out.println("str 3.isBlank()====>>  "+str3.isBlank());
        System.out.println("str 4.isBlank()====>>  "+str4.isBlank());
    }
}
