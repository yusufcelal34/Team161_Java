package day05_wrapperClass_MatematikselIslemler_Concatenation;

public class C07_Concatenation {
    public static void main(String[] args) {

        // Sadece verilen variable'lari kullanarak
        // istenen String'leri yazdirin
        String s1 = "Java";
        String s2 = " ";
        String s3 = "Candir";
        String s4 = "";
        int a = 3;
        int b = 4;

        System.out.println(s1 + s2 + s3 + s4 + a + b);

        // Java 7

        System.out.println(s1 + s2 + (a + b));

        // 12 Candir

        System.out.println(a*b + s2 + s3);

        // Java Candir 34
        System.out.println(s1 + s2 + s3 + s2 + a + b);

        // Java12Candir
        System.out.println(s1 + a*b + s3);

        // 34Java
        System.out.println(s4 + a + b + s1);

        

    }
}
