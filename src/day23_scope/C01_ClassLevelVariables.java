package day23_scope;

public class C01_ClassLevelVariables {

    String strI;
    static String strS = "Ali";
    int sayiI = 10;
    static int sayiS;
    char chrI;
    static char chrS = '#';
    boolean blI = true;
    static boolean blS;

    public static void main(String[] args) {

        System.out.println("strS : "+strS);
        System.out.println("sayiS : "+sayiS);
        System.out.println("chrS : "+chrS);
        System.out.println("blS : "+blS);

        C01_ClassLevelVariables obj = new C01_ClassLevelVariables();

        System.out.println("strI : "+obj.strI);
        System.out.println("sayiI : "+obj.sayiI);
        System.out.println("chrI : "+obj.chrI);
        System.out.println("blI : "+obj.blI);

    }

    public static void method1() {
    }

    public void method2() {
    }
}
