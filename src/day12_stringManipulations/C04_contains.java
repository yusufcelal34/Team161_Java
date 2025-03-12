package day12_stringManipulations;

public class C04_contains {
    public static void main(String[] args) {
        // String str = "Java çok güzel, çok.";

        String str = "Java öğrenen pişman olmaz";
        System.out.println(str.contains("a"));

        System.out.println(str.contains("a o"));


        System.out.println(str.contains("J    o"));

        System.out.println(str.contains("Java öğ"));

        
    }
}
