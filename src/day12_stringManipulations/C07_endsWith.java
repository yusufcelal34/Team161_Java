package day12_stringManipulations;

public class C07_endsWith {
    public static void main(String[] args) {

        String str = "Kod ahhh java";
        System.out.println(str.endsWith("Java"));
        System.out.println(str.endsWith("java"));
        System.out.println(str.endsWith("ava"));
        System.out.println(str.endsWith(" ava"));
        System.out.println(str.endsWith(""));


        System.out.println(str.endsWith("Java ahhh java"));;

        System.out.println(str.endsWith("***********************"));

        System.out.println(str.equals("Java"));
        System.out.println(str.equalsIgnoreCase("Java"));
        System.out.println(str.contains("Java"));
        System.out.println(str.startsWith("Java"));
        System.out.println(str.endsWith("Java"));

    }
}
