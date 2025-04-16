package day36_staticBlocks_passByValue;

public class C04_PassByValue {

    public static void main(String[] args) {

        String str = "Java Candır";

        System.out.println(str.toLowerCase());

        System.out.println(str);

        str = str.toLowerCase();

        System.out.println(str);
    }
}
