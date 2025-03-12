package day14_stringmanupulations;

import java.util.Scanner;

public class C02_ReplaceFirst {
    public static void main(String[] args) {

        String str = "Java ile kodlama cok guzel";
        System.out.println(str.replaceFirst("a" , " "));
        System.out.println("**************************");
        System.out.println(str.replaceAll("a", "A"));

        System.out.println("**************************");

        System.out.println(str.replaceAll("a", "A").replaceAll("e", "E"));
        System.out.println(str.replace('a', 'A').replace('e', 'E'));

        str = "sdkmgfkmödfh44hyjsbs54fghs64f5gb4s56d fd5g4s fds6 4ggfss ghtrw4";
        System.out.println(str);
        System.out.println("**************************");
        System.out.println(str.replaceAll("\\d", ""));
    }
}