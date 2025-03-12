package day19_methodOlusturma;

public class C08_JavaKullanacagiMethoduNasilBelirler {
    public static void main(String[] args) {

        topla(3, 4);

        topla(2.1, 3.2);

        topla(2, 3.4);

        topla(2, 3.4);

        topla(5.3, 4);

    }

    public static void topla(int a, int b) { // topla int int
        System.out.println("Iki int'in toplami : "+(a +" ve "+b)+" = " + (a + b));
        System.out.println("=========================");
        System.out.println("Iki int'in çarpımı : "+(a +" ve "+b)+" = " +  + (a * b));
        System.out.println("=========================");
    }

    public static void topla(double a, double b) { // topla double double
        System.out.println("Iki double'in toplami : "+(a +" ve "+b)+" = " +  + (a + b));
        System.out.println("=========================");
        System.out.println("Iki double'in çarpımı : "+(a +" ve "+b)+" = " +  + (a * b));
        System.out.println("=========================");
    }
}

