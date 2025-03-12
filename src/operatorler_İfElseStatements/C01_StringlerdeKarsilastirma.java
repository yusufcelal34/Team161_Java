package operatorler_İfElseStatements;

public class C01_StringlerdeKarsilastirma {
    public static void main(String[] args) {

        String s1 = "Ali";
        String s2 = "Ali";
        String s3 = "A" + "l" + "i";
        String s4 = "A";
        String s5 = "li";
        String s6 = s4+s5;  // Ali
        String s7 = new String("Ali");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s6);
        System.out.println(s1 == s7);
        System.out.println(s1 == "Ali");
        System.out.println("\n*******************\n");

        /*
         SIMDILIK =='i String'leri karsilastirmak icin kullanmayacagiz
         == hem metin degerine hem de referans'a bakar
         bu sebeple metinler ayni olsa bile
         bazi karsilastirmalarda false verir
         (bunu ilerde String Havuzu konusunda anlatacagiz)
         eger iki String'in metin olarak ayni olup olmadigini kontrol etmek istersek
         equals() kullanmaliyiz
         equals() SADECE metinlere bakar
         metinler ayni ise true
         metinler farkli ise false verir
         farkli karakter kullaniminda veya kucuk/buyuk harf farkliliklarinda
         sonuc false olur
         */


        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s6));
        System.out.println(s1.equals(s7));
        System.out.println(s1.equals("Ali"));
        System.out.println(s1.equals("ali"));

        System.out.println("\n*******************\n");

        System.out.println(s1.equals("Ali "));

    }
}
