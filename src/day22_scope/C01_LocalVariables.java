package day22_scope;

public class C01_LocalVariables {
    public static void main(String[] args) {

        int sayiMain = 23;

        int sayi = 10;

        for (int i = 0; i<55 ; i++){
            System.out.println(sayiMain);
            System.out.println(sayi);
            System.out.println("Java Candır");
            System.out.println("str");
        }

    }

    public static void method1() {

        int sayi = 45;

    }

    public static void method2() {
        int sayi = 50;

    }
}
