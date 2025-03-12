package day22_scope;

import day23_scope.C01_ClassLevelVariables;

public class C03_ClassLevelVariabless {

    String strI;
    static String strS = "Ali";
    int sayiI = 10;
    static int sayiS;
    char chrI;
    static char chrS = '#';
    boolean blI = true;
    static boolean blS;


    public static void main(String[] args) {

        System.out.println(strS);
        System.out.println(sayiS);
        System.out.println(chrS);
        System.out.println(blS);

        C01_ClassLevelVariables obj = new C01_ClassLevelVariables();

        System.out.println(obj.strI);
        System.out.println(obj.sayiI);
        System.out.println(obj.chrI);
        System.out.println(obj.blI);



    }
}
