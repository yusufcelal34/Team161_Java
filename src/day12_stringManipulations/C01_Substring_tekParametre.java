package day12_stringManipulations;

public class C01_Substring_tekParametre
{
    public static void main(String[] args) {

        String str = "Java Candır";
        System.out.println(str.charAt(3));
        System.out.println( str.substring(3));
        System.out.println(str.length()-3);
        System.out.println(str.substring(str.length()-3));
        System.out.println(str.substring(str.length()-5));

        System.out.println(str.substring(str.length()-4));

    }
}
