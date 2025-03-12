package day12_stringManipulations;

public class C03_concat
{
    public static void main(String[] args) {


        String s1 = "Java";
        String s2 = " ";
        String s3 = "güzeldir";
        String s4 = "";

        int sayi1 = 4;
        int sayi2 = 5;

        System.out.println(s1+s2+s3);
        System.out.println(s1.concat(s2) .concat(s3));

        System.out.println( s1+s2+sayi2 + sayi1);
        System.out.println( s1.concat(s2).concat(sayi2+s4));
    }
}
