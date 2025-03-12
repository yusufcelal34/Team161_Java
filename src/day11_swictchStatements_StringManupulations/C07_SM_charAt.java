package day11_swictchStatements_StringManupulations;

public class C07_SM_charAt {
    public static void main(String[] args) {
        String str = "Java güzeldir";

        // ilk harfi yazdir

        System.out.println(str.charAt(0));

        // 4. harfi yazdir
        System.out.println(str.charAt(3));

        // son harfi yazdirin
        // str'da 13 karakter var

        System.out.println(str.charAt(13-1));

        // karakter sayisinin 13 olduğunu biliyorsak
        // sondan 3. karakteri yazdirin

        System.out.println(str.charAt(10));

        System.out.println(str.length());
    }
}
